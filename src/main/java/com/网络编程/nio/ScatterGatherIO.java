package com.网络编程.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

/**
 * @author liyiruo
 * @Description
 * @Date 2021/1/16 下午12:57
 */
public class ScatterGatherIO {
    public static void main(String[] args) {
        String data = "my name is liyiruo ,i'am you father";
        gatherBytes(data);
        scatterBytes();
    }
    /**
     * gatherBytes() is used for reading the bytes from the buffers and write it
     * to a file channel.
     */
    public static void gatherBytes(String data) {
        String relativelyPath = System.getProperty("user.dir");
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(8);
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(1024);

        byteBuffer1.asIntBuffer().put(420);
        byteBuffer2.asCharBuffer().put(data);
        //gatherer 的作用在这里哦
        GatheringByteChannel gatherer = createChannelInstance(relativelyPath.concat("/testout.txt"), true);
        try {
            gatherer.write(new ByteBuffer[]{byteBuffer1, byteBuffer2});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * scatterBytes() is used for reading the bytes from a file channel into a
     * set of buffers.
     */
    public static void scatterBytes() {
        String relativelyPath = System.getProperty("user.dir");
        // The First Buffer is used for holding a random number
        ByteBuffer buffer1 = ByteBuffer.allocate(8);
        // The Second Buffer is used for holding a data that we want to write
        ByteBuffer buffer2 = ByteBuffer.allocate(400);
        ScatteringByteChannel scatter = createChannelInstance(relativelyPath.concat("/testout.txt"), false);

        try {
            scatter.read(new ByteBuffer[]{buffer1,buffer2});
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read the two buffers seperately
        buffer1.rewind();
        buffer2.rewind();
        int bufferOne = buffer1.asIntBuffer().get();
        String bufferTwo = buffer2.asCharBuffer().toString();

        // Verification of content
        System.out.println(bufferOne);
        System.out.println(bufferTwo);
    }


    private static FileChannel createChannelInstance(String file, boolean isOutput) {
        FileChannel fileChannel = null;
        try {
            if (!isOutput) {
                fileChannel = new FileInputStream(file).getChannel();
            } else {
                fileChannel = new FileOutputStream(file).getChannel();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fileChannel;
    }
}
