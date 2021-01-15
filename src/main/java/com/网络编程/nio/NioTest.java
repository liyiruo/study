package com.网络编程.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.DatagramChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @author liyiruo
 * @Description
 * @Date 2021/1/15 下午11:44
 */
public class NioTest {

    /*
    在Java NIO中，主要使用的通道如下：

FileChannel：文件通道用于从文件读取数据。它只能通过调用getChannel()方法来创建对象。不能直接创建FileChannel对象。下面是一个创建FileChannel对象的例子：FileInputStream fis = new FileInputStream("D:\\file-read.txt"); // Path of Input text file
ReadableByteChannel rbc = fis.getChannel();
Java
DatagramChannel：数据报通道可以通过UDP(用户数据报协议)通过网络读取和写入数据。它使用工厂方法来创建新对象。下面是打开DatagramChannel的语法：DatagramChannel ch = DatagramChannel.open();
Java
用于关闭DatagramChannel的语法：DatagramChannel ch = DatagramChannel.close();
Java
SocketChannel：数据报通道可以通过TCP(传输控制协议)通过网络读取和写入数据。 它还使用工厂方法来创建新对象。用于打开SocketChannel的语法：SocketChannel ch = SocketChannel.open();
ch.connect(new InetSocketAddress("somehost", someport));
Java
用于关闭SocketChannel的语法：SocketChannel ch = SocketChannel.close();
ch.connect(new InetSocketAddress("somehost", someport));
Java
ServerSocketChannel：ServerSocketChannel允许用户监听传入的TCP连接，与Web服务器相同。对于每个传入连接，都会为连接创建一个SocketChannel。下面是打开ServerSocketChannel的语法：ServerSocketChannel ch = ServerSocketChannel.open();
ch.socket().bind (new InetSocketAddress (somelocalport));
Java
下面是关闭ServerSocketChannel的语法：ServerSocketChannel ch = ServerSocketChannel.close();
ch.socket().bind (new InetSocketAddress (somelocalport));
*/


    public static void main(String[] args) throws IOException {
        String path = "/Users/liyiruo/Desktop";
        FileInputStream fis = new FileInputStream(path);
        FileChannel channel = fis.getChannel();


        DatagramChannel datagramChannel = DatagramChannel.open();
        //DatagramChannel ch = DatagramChannel.close();


        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress("loclhost",1000));

        //SocketChannel ch = SocketChannel.close();
        //ch.connect(new InetSocketAddress("somehost", someport));


        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.socket().bind(new InetSocketAddress(1000));

        //ServerSocketChannel ch = ServerSocketChannel.close();
        //ch.socket().bind (new InetSocketAddress (somelocalport));

    }
}
