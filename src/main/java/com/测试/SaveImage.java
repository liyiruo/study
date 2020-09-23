package com.测试;

import com.sun.tools.javac.util.Convert;

import java.io.*;

/**
 * 想在一个项目中把文件保存在本地，然后通过请求 返回
 * @author liyiruo
 */
public class SaveImage {
    public static void main(String[] args) {

/*
* 获取路径
* 将文件转化为字节数组
*
* */
        String path="";
        File file = new File(path);
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            FileReader reader = new FileReader(String.valueOf(fileInputStream));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
