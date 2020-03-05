package main.java.com.网络编程.net.tcp_img_thread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPThreadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(6666);
        //获取一个新连接 创建新线程
        while(true) {
            Socket socket = server.accept();
            new Thread(new Upload(socket)).start();
        }
    }
}
