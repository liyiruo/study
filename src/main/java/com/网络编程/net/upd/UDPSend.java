package main.java.com.网络编程.net.upd;

import java.io.IOException;
import java.net.*;

/**
 * 实现UDP協議的發送端:
 * 实现数据封装的java.net.DatagranPacket 将你的数据包装
 * 实现数据传输的类java.net.DatagramSocket 将数据包发送
 * 实现步骤：
 * 1.创建DatagramPacket对象，封装数据，接受的地址和端口
 * 2.创建DatagramSocket对象，
 * 3.调用DatagramSocket类的方法send，发送数据包
 * 4.关闭资源
 * DatagramPacket 构造方法
 */
public class UDPSend {
    public static void main(String[] args) throws IOException {
        //创建数据包对象，封装发送的数据，接受IP，端口
        byte[] date = "你好啊，UDP".getBytes();
        //创建InetAddress对象，封装自己的IP地址
        InetAddress inet = InetAddress.getByName("127.0.0.1");
        //四个参数分别为： 数组，发送数组中数据的长度，发送的地址，发送的端口
        DatagramPacket dp = new DatagramPacket(date, date.length, inet, 6000);
        //创建DatagramSocket对象，数据包的发送和接受
        DatagramSocket ds = new DatagramSocket();
        //电泳ds对象的方法send,发送数据
        ds.send(dp);
        //关闭资源
        ds.close();
    }


}
