package com.IO流;

import java.io.*;

/**
 * 当你创建一个流对象时，必须传入一个文件路径
 * 把字节写入
 */
public class _1_FileOutputStreamConstructor {
    public static void main(String[] args) throws IOException {
        /*
         * 创建一个文件字节输出流
         */
        File file = new File("outFile.txt");
        FileOutputStream fos = new FileOutputStream(file);
        /**
         * 向文件里写出一个字节
         * 一个字节=8个比特位 1>>7 ==>1000000
         * 如果传入的数字大于127  比特位>8位会导致写不全
         * 字节流会根据电脑系统的编码格式 解码为相应的字符。
         * 大于127的数字 由于流不全 可能无法解析，产生乱码或？
         */
        fos.write(99);
        //向文件里写入换行
        fos.write("\r\n".getBytes());
        //向文件里写字节数组
        byte[] bytes = "你好，这世界".getBytes();
        fos.write(bytes);
        //向文件里写字节数据中的片段
        byte[] b = "abcdefg".getBytes();
        fos.write(b,2,2);
        fos.close();



    }
}
