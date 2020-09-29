package com.网络编程.net.tcp_img;

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
        ServerSocket server = new ServerSocket(6666);
        Socket socket = server.accept();
        InputStream in= socket.getInputStream();

        /**
         * 创建文件夹
         */
        String path = "F:\\test\\server";
        File upload = new File(path);
        if (!upload.exists()) {
            upload.mkdirs();
        }

        /**
         * 将文件写入目标文件夹
         */

        //FileOutputStream outputStream = new FileOutputStream(upload+"\\泰国潘婷励志广告.flv");

        String fileName = System.currentTimeMillis()+""+new Random().nextInt(999999);
        FileOutputStream outputStream = new FileOutputStream(upload+File.separator+fileName+".flv");



        byte[] bytes = new byte[1024];
        int len=0;
        int index = 0;
            //这个read会一直读，或者等待读
        while ((len=in.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
            System.out.println("TCPServer==>第"+(index++)+"次循环");
        }
        //通过客户端连接对象获取字节输出流
        OutputStream out = socket.getOutputStream();
        out.write("上传成功!!!".getBytes());

        outputStream.close();
        socket.close();
        server.close();



    }
}
