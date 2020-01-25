package com.java_base.net.tcp_img_thread;

import java.io.*;
import java.net.Socket;

/**
 * 实现TCP图片上传客户端
 * 实现步骤：
 * 1.Socket套接字连接服务器
 * 2.通过Socket获取字节输出流，写图片
 * 3.使用自己的流对象，读取图片数据源
 * FileInputstream
 * 4.读取图片，使用字节输出流，将图片写到服务器
 * 采用字节数组进行缓冲
 * 5.通过Socket套接字获取字节输入流
 * 读取服务器发回来的上传成功
 * 6.关闭资源
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        /**
         * 连接到服务器
         */
        Socket socket = new Socket("127.0.0.1", 6666);
        OutputStream out = socket.getOutputStream();
        /**
         * 获取本地视频
         */
        String path = "F:\\test\\client\\泰国潘婷励志非商业广告You..flv";
        File file = new File(path);
        InputStream in = new FileInputStream(file);
        int len = 0;
        int index = 0;
        byte[] bytes = new byte[1024];
        while ((len=in.read(bytes))!=-1) {
            out.write(bytes,0,len);
            System.out.println("TCPClient==>第"+(index++)+"次循环");
        }
        //给服务器写终止序列
        socket.shutdownOutput();
        /**
         * 从服务器获取字节输入流，读取服务器的上传成功
         */
        InputStream inputStream = socket.getInputStream();
        //等待服务器返回的数据
        len = inputStream.read(bytes);
        String msg = new String(bytes, 0, len);
        System.out.println(msg);

        in.close();
        socket.close();
    }

}
