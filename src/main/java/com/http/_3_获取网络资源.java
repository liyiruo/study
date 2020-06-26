package com.http;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class _3_获取网络资源 {
    /**
     * 从网上获取资源
     * 读取并解析json文件: http://123.56.191.196:8080/a/a/d/list_slide_1_0.json，必须是在线读取。
     * 把里面的图片下载到本地，并打印出图片文件名和文件大小。
     */

    public static void main(String[] args) throws IOException {

        String url = "http://123.56.191.196:8080/a/a/d/list_slide_1_0.json";
        URL u = new URL(url);
        /**
         * 只要能够获取到一个流就可以，不管什么流，都能转化为一个StringBuffer 接收
         */
        InputStream openStream = u.openStream();
        BufferedInputStream bis = new BufferedInputStream(openStream);
        //FileInputStream 构造 里需要传一个一个路径
        //FileInputStream fis = new FileInputStream(openStream);
        //ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("666".getBytes());

        StringBuffer buffer = new StringBuffer();
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = openStream.read(bytes)) != -1) {
            buffer.append(new String(bytes, 0, len));
        }
        String dataStr = buffer.toString();
        System.out.println("获取到的json" + dataStr);

        final String savePath = "src/main/java/com/function/";
        //解析出json
        JSONArray json = JSONArray.parseArray(dataStr);
        for (int i = 0; i < json.size(); i++) {
            JSONObject jsonObject = JSON.parseObject(json.get(i).toString());
            String photourl = jsonObject.get("photo").toString();
            String[] strings = photourl.split("/");
            String photoName = strings[strings.length - 1];
            /**
             * 1.创建 url连接
             * 2.获取流
             * 3.创建文件
             * 4.创建文件流
             */
            URL photoUrl = new URL(photourl);
            URLConnection openConnection = photoUrl.openConnection();
            //获取到图片的流
            InputStream photoStream = openConnection.getInputStream();
            /*
             * 将获取到的流输出到文件
             */
            ByteArrayOutputStream outStream = new ByteArrayOutputStream();
            bytes = new byte[1024];
            len = 0;
            while ((len = photoStream.read(bytes)) != -1) {
                outStream.write(bytes, 0, len);
            }
            long data = outStream.toByteArray().length;
            System.out.println("photoUrl==>" + photourl + ",图片名称：" + photoName + ",图片大小：" + data / 1024 + "kB");
            outStream.close();
            photoStream.close();

            String filePath = savePath.concat(photoName);
            File file = new File(filePath);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(outStream.toByteArray());
            fileOutputStream.flush();
            fileOutputStream.close();
        }

    }


}
