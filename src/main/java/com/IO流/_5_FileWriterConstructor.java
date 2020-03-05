package com.IO流;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 小贴士：字符流，只能操作文本文件，不能操作图片，视频等非文本文件。
 * 当我们单纯读或者写文本文件时使用字符流其他情况使用字节流
 */
public class _5_FileWriterConstructor {
    public static void main(String[] args) throws IOException {
        //创建字符输出流的两种方式
        String path = "outFile.txt";
        File file = new File(path);
        FileWriter fw1 = new FileWriter(file);

        FileWriter fw2 = new FileWriter(path);

        fw1.write(97);//写出第一个字符
        fw1.write(130);//写出第一个字符
        fw1.write("你好");//写出一个字符串
        fw1.write('x');//写出一个字符
        fw1.write(30000);//写出第一个字符 中文编码表中30000对应一个汉字。
        /**
         * 【注意】关闭资源时,与FileOutputStream不同。
         * 如果不关闭,数据只是保存到缓冲区，并未保存到文件。
         * flush()之后仍然可以写出
         */
        fw1.flush();
        //直接写出Stirng字符串
        fw1.write("，还可以继续写，但是关闭后就不可以在写了");
        //可以将字符串转化为char[]再写出
        fw1.write("；字符串转化为数组输出".toCharArray());
        //可以截取字符串中的部分内容写出
        fw1.write(";123456;",2,2);
        //关闭输出流
        fw1.close();
    }
}
