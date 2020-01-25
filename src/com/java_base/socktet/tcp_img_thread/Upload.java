package com.java_base.socktet.tcp_img_thread;

import java.io.*;
import java.net.Socket;
import java.util.Random;

public class Upload implements Runnable {

    private Socket socket;

    public Upload(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream in = socket.getInputStream();
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
            String fileName = System.currentTimeMillis() + "" + new Random().nextInt(999999);
            FileOutputStream outputStream = new FileOutputStream(upload + File.separator + fileName + ".flv");
            byte[] bytes = new byte[1024];
            int len = 0;
            int index = 0;
            //这个read会一直读，或者等待读
            while ((len = in.read(bytes)) != -1) {
                outputStream.write(bytes, 0, len);
                System.out.println("TCPServer==>第" + (index++) + "次循环");
            }
            //通过客户端连接对象获取字节输出流
            OutputStream out = socket.getOutputStream();
            out.write("上传成功!!!".getBytes());

            outputStream.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
