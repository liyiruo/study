package com.网络编程.nio.selector;

import java.io.IOException;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * @author liyiruo
 * @Description
 * @Date 2021/1/16 下午4:05
 */
public class SelectorClient {
    public static void main(String[] args) throws IOException {

        SocketChannel channel = SocketChannel.open();
        InetSocketAddress socketAddress = new InetSocketAddress("127.0.0.1", 8080);
        boolean b = channel.connect(socketAddress);

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        String s = "你好啊" + System.currentTimeMillis();
        s = "Bye Bye";
        buffer.clear();
        buffer.put(s.getBytes());
        buffer.flip();
        while (buffer.hasRemaining()) {
            channel.write(buffer);
        }
        channel.close();
    }
}
