package com.IO流;

import java.io.FileWriter;
import java.io.IOException;

/**
 * java 9 对于 io流释放资源 进行了优化
 */
public class _7_IOException_forJAVA9 {

    public static void main(String[] args) {
     /*

     FileWriter fw = new FileWriter("outFile.txt")
        try (fw) {
            fw.write("这样 try(){}catch(){}不用再特意关闭资源");
            //fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        */
    }
}
