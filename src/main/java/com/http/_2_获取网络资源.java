package com.http;

import com.alibaba.fastjson.JSON;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * 从网上获取资源
 * 读取并解析json文件: http://123.56.191.196:8080/a/a/d/list_slide_1_0.json，必须是在线读取。
 * 把里面的图片下载到本地，并打印出图片文件名和文件大小。
 */
public class _2_获取网络资源 {

    public static void main(String[] args) throws IOException {
        String url = "http://123.56.191.196:8080/a/a/d/list_slide_1_0.json";
        String savePath = "src/main/java/com/function/";
        /**
         * 思路：
         * 1.创建流
         * 2.读取流
         * 3.将流转化为字符串
         * 4.将json串解析成装map的list
         */
        URL u = new URL(url);
        InputStream is = u.openStream();
        byte[] bytes = new byte[1024];
        int ln = 0;
        StringBuilder sb = new StringBuilder();
        while ((ln = is.read(bytes)) != -1) {
            sb.append(new String(bytes, 0, ln));
        }
        String json = sb.toString();
        //将json串解析成装map的list
        List<HashMap> mapList = JSON.parseArray(json, HashMap.class);
        Iterator<HashMap> iterator = mapList.iterator();
        while (iterator.hasNext()) {
            String photoUrl = (String) iterator.next().get("photo");
            String[] strings = photoUrl.split("/");
            String photoName = strings[strings.length - 1];
            //获取流
            URL urlPhoto = new URL(photoUrl);
            InputStream openStream = urlPhoto.openStream();
            //输出流
            String path = savePath.concat(photoName);
            FileOutputStream fos = new FileOutputStream(path);
            int data = 0;//计算流的大小
            int len = 0;
            byte[] b = new byte[1024];
            while ((len = openStream.read(b)) != -1) {
                fos.write(b, 0, len);
                data += len;
            }
            System.out.println("图片名称为：" + photoName + "；图片大小为：" + data / 1024 + "kb");
        }
    }
}
