package com.function;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class MyTest2 {


    public static void main(String[] args) throws IOException {
        /**
         * 1.创建连接
         * 2.获取输入流
         * 3.
         */
        /**
         * 1.创建连接
         */
        String url = "http://123.56.191.196:8080/a/a/d/list_slide_1_0.json";
        URL u = new URL(url);
        InputStream openStream = u.openStream();
        URLConnection connection = u.openConnection();
        /**
         * 2.获取输入流
         */
        InputStream dataInputStream = connection.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(dataInputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        StringBuffer buffer = new StringBuffer();
        String line;
        while ((line = reader.readLine()) != null) {
            buffer.append(line);
        }
        String dataStr = buffer.toString();
        System.out.println("获取到的json"+dataStr);



        String savePath = "/Users/liyiruo/Desktop/";
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
            /**
             * 将获取到的流输出到文件
             */
            ByteArrayOutputStream outStream = new ByteArrayOutputStream();
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = photoStream.read(bytes)) != -1) {
                outStream.write(bytes, 0, len);
            }
            long data = outStream.toByteArray().length;
            System.out.println("photoUrl==>"+photourl+",图片名称：" + photoName + ",图片大小：" + data/1024 + "kB");
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
