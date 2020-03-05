package com.IO流;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * java7 对io流 的资源释放进行了优化。
 */
public class _6_IOException {

    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("outFile.txt")) {
            fw.write("这样 try(){}catch(){}不用再特意关闭资源");
            //fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
