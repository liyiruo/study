package com.function;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * 从网上获取资源
 * 读取并解析json文件: http://123.56.191.196:8080/a/a/d/list_slide_1_0.json，必须是在线读取。
 * 把里面的图片下载到本地，并打印出图片文件名和文件大小。
 */
public class GetResourceFromWWW {

    public static void main(String[] args) throws IOException {

        String url = "http://123.56.191.196:8080/a/a/d/list_slide_1_0.json";
        String fileName = "666.txt";
        String savePath = "/Users/liyiruo/Desktop/";

/*
        URL url2 = new URL(url);
        InputStream openStream = url2.openStream();

        InputStreamReader isr = new InputStreamReader(openStream);

        byte[] bytes = new byte[1024];
        int ln = isr.read();
        System.out.println(ln);
        System.out.println(openStream.read());
        */

        /*URL url = new URL(jsonUrl);
        InputStream is = url.openStream();

        BufferedInputStream bis = new BufferedInputStream(is);
        sb = new StringBuffer("");
        int len = 0;
        byte[] temp = new byte[1024];
        while ((len = bis.read(temp)) != -1) {
            sb.append(new String(temp, 0, len));
        }
        System.out.println(sb.toString());
*/

        URL u = new URL(url);

        //第一种流
        InputStream openStream = u.openStream();

        //第二种流
        URLConnection urlConnection = u.openConnection();
        InputStream inputStream = urlConnection.getInputStream();

        //
        InputStreamReader inputStreamReader = new InputStreamReader(openStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        StringBuilder stringBuilder = new StringBuilder();



        String len = "";
        while ((len = bufferedReader.readLine())!=null) {
            stringBuilder.append(len);
        }
        System.out.println(stringBuilder.toString());




        System.out.println("==================================");
        BufferedInputStream bis = new BufferedInputStream(openStream);
        int ln=0;
        byte[] bytes = new byte[1024];
        while ((ln = bis.read(bytes)) != -1) {
            stringBuilder.append(bytes);
        }
        System.out.println(""+stringBuilder);


    }

    /*
     *//**
     * 从网络Url中下载文件
     *
     * @param urlStr
     * @param fileName
     * @param savePath
     * @throws IOException
     *//*
    public static void downLoadFromUrl(String urlStr, String fileName, String savePath) throws IOException {
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        //设置超时间为3秒
        conn.setConnectTimeout(3 * 1000);
        //防止屏蔽程序抓取而返回403错误
        conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");

        //得到输入流
        InputStream inputStream = conn.getInputStream();
        //获取自己数组
        byte[] getData = readInputStream(inputStream);

        //文件保存位置
        File saveDir = new File(savePath);
        if (!saveDir.exists()) {
            saveDir.mkdir();
        }
        File file = new File(saveDir + File.separator + fileName);
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(getData);
        if (fos != null) {
            fos.close();
        }
        if (inputStream != null) {
            inputStream.close();
        }
        System.out.println("info:" + url + " download success");
    }

    *//**
     * 从输入流中获取字节数组
     *
     * @param inputStream
     * @return
     * @throws IOException
     *//*
    public static byte[] readInputStream(InputStream inputStream) throws IOException {
        byte[] buffer = new byte[1024];
        int len = 0;

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        while ((len = inputStream.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
        bos.close();
        return bos.toByteArray();
    }*/
}
