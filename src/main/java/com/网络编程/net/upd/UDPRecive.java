package com.网络编程.net.upd;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 实现UDP接收器
 *   实现封装数据包java.net.DatagramPacket将数据接受
 *   实现输出传输 java.net.DatagramSocket接收数据包
 *  实现步骤：
 *    1.创建DatagramSocket对象，绑定端口号，要与发送端口号一致
 *    2.创建字符数组，接受发来的数据
 *    3.创建数据包对象DatagramPacket
 *    4.调用DatagramSocket对象方法
 *              receive(DatagramPacket dp)接收数据数据放在数据包中
 *    5.拆包：
 *      发送的IP地址
 *      接收到的字节个数
 *         数据包对象DatagramPramSocket绑定端口
 *      发送发的端口号
 *    6.关闭资源
 */
public class UDPRecive {
    public static void main(String[] args) throws IOException {
        //创建数据包传输对象DatagramSocket 绑定端口号
        DatagramSocket ds = new DatagramSocket(6000);
        //创建字节数组
        byte[] data = new byte[1024];
    //创建数据包接收，传递字节数组
        DatagramPacket dp = new DatagramPacket(data, data.length);
    /*
    调用DatagramSocket对象方法receive(DatagramPacket dp)
    接收数据数据放在数据包中
    */
        ds.receive(dp);
        //获取IP地址
        String ip = dp.getAddress().getHostAddress();
        //获取名称
        String name = dp.getAddress().getHostName();
        //获取端口号
        int port = dp.getPort();
        //输出数据
        System.out.println(new String(data,0,dp.getLength())+"\n name: "+name+"\n ip: "+ip+"\n port: "+port);

        ds.close();
    }
}
