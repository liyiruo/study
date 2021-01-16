package com.网络编程.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

/**
 * @author liyiruo
 * @Description 如何将数据从一个通道复制到另一个通道或从一个文件复制到另一个文件的示例
 * @Date 2021/1/15 下午11:59
 */
public class ChannelDemo {
    public static void main(String[] args) throws IOException {

        String relativelyPath = System.getProperty("user.dir");//当前项目下的路径
        FileInputStream fileInputStream = new FileInputStream(relativelyPath.concat("/textin.txt"));
        //FileChannel fileChannel = fileInputStream.getChannel();
        ReadableByteChannel source = fileInputStream.getChannel();

        FileOutputStream fileOutputStream = new FileOutputStream(relativelyPath.concat("/testout.txt"));
        WritableByteChannel destination = fileOutputStream.getChannel();

        copyData(source,destination);

        source.close();
        destination.close();
        System.out.println("Copy Data finished.");
    }

    /**
     * 复制文件的方法
     * @param src Channel 数据源
     * @param dest Channel 数据目的
     * @throws IOException
     */
    private static void copyData(ReadableByteChannel src, WritableByteChannel dest) throws IOException {
        //创建一个buffer，设置buffer长度
        ByteBuffer buffer = ByteBuffer.allocate(20 * 1024);
        //循环将数据源读到buffer中，反转后，将buffer写入到目标channel，最后清空buffer
        while (src.read(buffer) != -1) {
            buffer.flip();
            while (buffer.hasRemaining()) {
                dest.write(buffer);
            }
            buffer.clear();
        }
    }

}
