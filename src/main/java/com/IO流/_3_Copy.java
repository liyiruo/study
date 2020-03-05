package com.IO流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用流 复制图片
 */
public class _3_Copy {
    public static void main(String[] args) throws IOException {
        //创建2个流
        FileInputStream fis = new FileInputStream("d:/111.jpg");
        FileOutputStream fos = new FileOutputStream("d:/222.jpg");
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fis.close();
        fos.close();
    }
}
