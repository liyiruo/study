package com.java_base.socktet.tcp_img_thread;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * TCP图片上传服务器
 * 1.ServerSocket套接字对象，监听端口6666
 * 2.方法accept()获取客户端的连接对象
 * 3.客户端连接对象获取字节流输入流，读取客户端发送图片
 * 4.创建File对象，绑定上传文件夹
 *      判断文件夹存在否，不存在，创建文件夹
 * 5.创建字节输出流，数据目的File对象所在文件夹
 * 6.字节流读取图片，字节流将图片写入到目的文件夹中
 * 7.将上传成功写hi客户端
 * 8.关闭资源
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {

        //这个就没有用了
    }
}
