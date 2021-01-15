package com.网络编程.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author liyiruo
 * @Description
 * @Date 2020/12/29 下午8:35
 */
public class ChannelTest {
    public static void main(String[] args) throws IOException {

        RandomAccessFile aFile = new RandomAccessFile("/Users/liyiruo/Desktop/nio-data.txt", "rw");
        FileChannel inChannel = aFile.getChannel();
        ByteBuffer buf = ByteBuffer.allocate(48);
        int bytesRead = inChannel.read(buf);
        while (bytesRead != -1) {
            System.out.println("Read " + bytesRead);
            buf.flip();
            while (buf.hasRemaining()) {
                System.out.print((char) buf.get());
            }
            /**
             *Buffer.rewind()将position设回0，所以你可以重读Buffer中的所有数据。
             * limit保持不变，仍然表示能从Buffer中读取多少个元素（byte、char等）。
             */
            buf.rewind();
            System.out.println("\n第二遍");
            while (buf.hasRemaining()) {
                System.out.print((char) buf.get());
            }
            /**
             * 清空buf
             */
            buf.clear();
            bytesRead = inChannel.read(buf);
        }
        aFile.close();
    }
}
