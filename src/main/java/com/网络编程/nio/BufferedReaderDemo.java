package com.网络编程.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author liyiruo
 * @Description BufferedReader从testout.txt文件中读取行的简单示例
 * @Date 2021/1/16 上午12:43
 */
public class BufferedReaderDemo {
    public static void main(String[] args) {
        Path file = null;
        BufferedReader bufferedReader = null;
        String relativelyPath = System.getProperty("user.dir");
        try {
            file = Paths.get(relativelyPath.concat("/testout.txt"));
            InputStream inputStream = Files.newInputStream(file);
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            System.out.println("Reading the Line of testout.txt file: \n" + bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }

    }
}
