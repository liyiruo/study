package com.网络编程.nio;

import java.io.*;
import java.nio.channels.FileChannel;

/**
 * @author liyiruo
 * @Description channel transferTo 将多个文件合并成一个文件
 * @Date 2021/1/16 下午3:15
 */
public class TransferDemo {
    public static void main(String[] args) throws IOException {
        String relativelyPath = System.getProperty("user.dir");
        String[] iF = new String[]{relativelyPath.concat("/testout.txt"),
                relativelyPath.concat("/textin.txt")};
        String oF = relativelyPath + "/combine_output.txt";

        FileOutputStream output = new FileOutputStream(new File(oF));

        FileChannel targetChannel = output.getChannel();


        for (int i = 0; i < iF.length; i++) {
            FileInputStream input = new FileInputStream(iF[i]);
            FileChannel inputChannel = input.getChannel();
            inputChannel.transferTo(0, inputChannel.size(), targetChannel);
            inputChannel.close();
            input.close();
        }

        targetChannel.close();
        output.close();
        System.out.println("All jobs done...");
    }
}
