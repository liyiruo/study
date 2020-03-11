package com.function;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/**
 * 从网上获取资源
 * 读取并解析json文件: http://123.56.191.196:8080/a/a/d/list_slide_1_0.json，必须是在线读取。
 * 把里面的图片下载到本地，并打印出图片文件名和文件大小。
 */
public class _1_获取网络资源 {


    public static void main(String[] args) throws IOException {

        String url = "http://123.56.191.196:8080/a/a/d/list_slide_1_0.json";
        URL u = new URL(url);
        URLConnection connection = u.openConnection();
        InputStream dataInputStream = connection.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(dataInputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        StringBuffer buffer = new StringBuffer();
        String line;
        while ((line = reader.readLine()) != null) {
            buffer.append(line);
        }
        String dataStr = buffer.toString();
      final  String savePath = "src/main/java/com/function/";

        //解析出json
        JSONArray json = JSONArray.parseArray(dataStr);
        for (int i = 0; i < json.size(); i++) {
            JSONObject jsonObject = JSON.parseObject(json.get(i).toString());
            String photourl = jsonObject.get("photo").toString();
            String[] strings = photourl.split("/");
            String photoName = strings[strings.length - 1];
            /**
             * 1.创建 url连接
             * 2.获取输入流
             * 3.创建文件
             * 4.创建文件输入流
             * 5.将输入流写入输出流
             * 6.关闭输入流
             * 7.关闭输出流
             */
            //1.创建 url连接
            URL photoUrl = new URL(photourl);
            URLConnection openConnection = photoUrl.openConnection();
            //2.获取输入流
            InputStream photoStream = openConnection.getInputStream();
            //3.创建文件
            String filePath = savePath.concat(photoName);
            File file = new File(filePath);
           // 4.创建文件输入流
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            //5.将输入流写入输出流
            byte[] bytes = new byte[1024];
            int len = 0;
            long data=0;
            while ((len = photoStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, len);
                data+=len;
            }
            System.out.println("photourl==>"+photourl+",图片名称：" + photoName + ",图片大小：" + data/1024 + "kB");
            //6.关闭输入流
            photoStream.close();
            //7.关闭输出流
            fileOutputStream.flush();
        }
    }
}
