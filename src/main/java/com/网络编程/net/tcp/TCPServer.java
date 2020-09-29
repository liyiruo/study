package com.网络编程.net.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 实现TCP服务流程
 * 表示服务器程序的类java.net.ServerSocket
 *    构造方法：
 *       ServerSocket（int prot)传递端口号
 *       必须使用端口号的套接对象socket
 *       Socket accept();
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建服务器，端口
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        System.out.println(socket);
        InputStream in= socket.getInputStream();
        //int read = in.read();
        byte[] data = new byte[1024];
        int len = in.read(data);
        //获取到的数据
        String s = new String(data, 0, len);
        System.out.println(s);

        /**
         * 创建个文件把文件写入到本地
         */
        String path="f://test.txt";
        File file = new File(path);
        OutputStream outputStream = new FileOutputStream(file);
        outputStream.write(data);

        /**
         * 把信息发回去
         */

        OutputStream out = socket.getOutputStream();
        out.write(("收到:"+s).getBytes());

    }
}
