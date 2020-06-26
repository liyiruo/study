package com.http;


import com.alibaba.fastjson.JSON;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
/**
 * 从网上获取资源
 * 读取并解析json文件: http://123.56.191.196:8080/a/a/d/list_slide_1_0.json，必须是在线读取。
 * 把里面的图片下载到本地，并打印出图片文件名和文件大小。
 */
public class _4_获取网络资源 {

    public static void main(String[] args) {
        String Jsonurl = "http://123.56.191.196:8080/a/a/d/list_slide_1_0.json";
        // 读取json
        String json = readJson(Jsonurl);
        // 解析json
        String[] strings = analysisJson(json);
        for (int i = 0; i < strings.length; i++) {
            // 下载图片
            System.out.println(strings[i]);
            try {
                photoRead(strings[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    /**
     * 读取json文件
     *
     * @param jsonUrl
     * @return
     */
    static String readJson(String jsonUrl) {
        StringBuffer sb = null;
        try {
            URL url = new URL(jsonUrl);
            InputStream is = url.openStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            sb = new StringBuffer("");
            int len = 0;
            byte[] temp = new byte[1024];
            while ((len = bis.read(temp)) != -1) {
                sb.append(new String(temp, 0, len));
            }
            System.out.println(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    /**
     * 解析json
     * @param jsonStr
     * @return
     */
    static String[] analysisJson(String jsonStr) {
        List<HashMap> list = JSON.parseArray(jsonStr, HashMap.class);
        int size = list.size();
        String[] jsonArray=new String[size];
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).get("photo"));
            jsonArray[i]= (String) list.get(i).get("photo");
        }
        return jsonArray;
    }

    /**
     * 写图片
     *
     * @param photoUrl
     * @throws Exception
     */
    static void photoRead(String photoUrl) throws Exception {
        File tempFile =new File( photoUrl.trim());

        String fileName = tempFile.getName();
        //new一个URL对象
        URL url = new URL(photoUrl);
        //打开链接
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        //设置请求方式为"GET"
        conn.setRequestMethod("GET");
        //超时响应时间为5秒
        conn.setConnectTimeout(5 * 1000);
        //通过输入流获取图片数据
        InputStream inStream = conn.getInputStream();
        //得到图片的二进制数据，以二进制封装得到数据，具有通用性
        byte[] data = readInputStream(inStream);
        // 文件大小byte
        int length = data.length;
        final  String savePath = "src/main/java/com/function/";
        System.out.println(savePath+fileName+"：文件大小"+length/1024+"k");
        //new一个文件对象用来保存图片，默认保存当前工程根目录
        File imageFile = new File(fileName);
        //创建输出流
        FileOutputStream outStream = new FileOutputStream(imageFile);
        //写入数据
        outStream.write(data);
        //关闭输出流
        outStream.close();
    }

    public static byte[] readInputStream(InputStream inStream) throws Exception {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        //创建一个Buffer字符串
        byte[] buffer = new byte[1024];
        //每次读取的字符串长度，如果为-1，代表全部读取完毕
        int len = 0;
        //使用一个输入流从buffer里把数据读取出来
        while ((len = inStream.read(buffer)) != -1) {
            //用输出流往buffer里写入数据，中间参数代表从哪个位置开始读，len代表读取的长度
            outStream.write(buffer, 0, len);
        }
        //关闭输入流
        inStream.close();
        //把outStream里的数据写入内存
        return outStream.toByteArray();
    }


}
