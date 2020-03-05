package main.java.com.网络编程.net.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 实现TCP客户端，连接到服务器
 * 和服务器实现数据交换
 * 实现TCP客户端程序的类，java.net.socket
 * 构造方法：
 *  Socket(String host,int port)传递服务器IP和端口号
 *   注意：构造方法只要运行，就会和服务器进行连接，连接失败，抛出异常
 *      Output Stream  getInputStream()
 *       作用：将字符输出，输出到服务器
 *      IputStream getInputStream() 返回套接字的输入流
 *        作用：从服务器读取数据
 *    客户端服务器数据交换，必须使用套接字对象Socket中的获取的IO流，自己new的不行
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        Socket socket = new Socket("127.0.0.1", 8888);
        //通过客户端套接字对象Socket方法，获取字符输出流
        OutputStream os = socket.getOutputStream();
        //将数据写入服务器
        os.write("服务器ok".getBytes());

        //socket.close();
        /**
        * 接收服务器返回的数据
        */
        InputStream inputStream = socket.getInputStream();
        byte[] data = new byte[1024];
        int len = inputStream.read(data);
        String s = new String(data, 0, len);
        System.out.println(s);
    }
}
