package com.IO流;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class _2_FileInputStreamConstructor {
    public static void main(String[] args) throws IOException {
        //创建流
        File file = new File("outFile.txt");
        FileInputStream fis = new FileInputStream(file);
        //读取字节  流里面有指针 每次读取都会向后移动
        int read = fis.read();
        System.out.print((char) read);
        read = fis.read();
        System.out.print((char) read);
        read = fis.read();
        System.out.print((char) read);
        read = fis.read();
        System.out.print((char) read);
        read = fis.read();
        System.out.print((char) read);
        read = fis.read();
        System.out.print((char) read);
        read = fis.read();
        System.out.print(read);

        //改进循环方式
        //新建一个流
        FileInputStream _fis = new FileInputStream(file);
        // byte[] bytes = new byte[10];
        int len = 0;
        while ((len = _fis.read()) != -1) {
            System.out.print((char) len);
        }
        //改进循环方式
        //新建一个流
        System.out.println("=============");
        FileInputStream _fis2 = new FileInputStream(file);
        byte[] bytes = new byte[1024];
        int ln;
        while ((ln = _fis2.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,ln));
        }
    }
}
