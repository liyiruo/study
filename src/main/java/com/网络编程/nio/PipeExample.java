package com.网络编程.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;

/**
 * @author liyiruo
 * @Description  基本管道示例
 * @Date 2021/1/16 下午10:18
 */
public class PipeExample {
    public static void main(String[] args) throws IOException {
        Pipe pipe = Pipe.open();
        Pipe.SinkChannel skChannel = pipe.sink();
        String td = "Data is successfully sent for checking the java NIO Channel Pipe.";
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024 * 2);
        byteBuffer.clear();
        byteBuffer.put(td.getBytes());
        byteBuffer.flip();

        while (byteBuffer.hasRemaining()) {
            skChannel.write(byteBuffer);
        }

        Pipe.SourceChannel sourceChannel = pipe.source();
        byteBuffer = ByteBuffer.allocate(1024 * 3);
        while (sourceChannel.read(byteBuffer) > 0) {
            byteBuffer.flip();

            while (byteBuffer.hasRemaining()) {
                char b = (char)byteBuffer.get();
                System.out.print(b);
            }
            byteBuffer.clear();
        }
    }
}
