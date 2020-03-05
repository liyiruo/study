package com.IO流;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * java.io.FileReader类是读取字符文件的便利类。构造时使用系统默认的字符编码和默认字节缓冲区。
 */
public class _4_FileReaderConstructor {
    public static void main(String[] args) throws IOException {
        //创建流的两种方式
        String path = "outFile.txt";
        File file = new File(path);
        FileReader fr1 = new FileReader(file);

        FileReader fr2 = new FileReader(path);
        int ln = 0;
        //一个一个的读取文件里的字符
        while ((ln = fr1.read()) != -1) {
            System.out.print((char) ln);
        }

        System.out.println("-------------------------");

         ln = 0;
         //此处定义的是字符类型的数组
        char[] chars = new char[2];
        //一次读chars的 读取文件里的字符
        while ((ln = fr2.read(chars)) != -1) {
            System.out.print(new String(chars));
        }

        System.out.println("=========================");
        FileReader fr3 = new FileReader(path);
        ln = 0;
        //此处定义的是字符类型的数组
        char[] chars2 = new char[2];
        //一次读chars的 读取文件里的字符
        while ((ln = fr3.read(chars2)) != -1) {
            System.out.print(new String(chars2,0,ln));
        }
    }
}
