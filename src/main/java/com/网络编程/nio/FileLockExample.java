package com.网络编程.nio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author liyiruo
 * @Description
 * @Date 2021/1/16 下午11:58
 */
public class FileLockExample {
    public static void main(String[] args)
            throws IOException {
        String input = "* end of the file.";
        System.out.println("Input string to the test file is: " + input);
        ByteBuffer buf = ByteBuffer.wrap(input.getBytes());
        String fp = "testout-file.txt";
        Path pt = Paths.get(fp);
        FileChannel fc = FileChannel.open(pt, StandardOpenOption.WRITE,
                StandardOpenOption.APPEND);
        System.out.println("File channel is open for write and Acquiring lock...");
        // position of a cursor at the end of file
        fc.position(fc.size() - 1);
        FileLock lock = fc.lock();
        System.out.println("The Lock is shared: " + lock.isShared());
        fc.write(buf);
        fc.close(); // Releases the Lock
        System.out.println("Content Writing is complete. Therefore close the channel and release the lock.");
        PrintFile.print(fp);
    }
}

class PrintFile {

    public static void print(String path) throws IOException {
        FileReader filereader = new FileReader(path);
        BufferedReader bufferedreader = new BufferedReader(filereader);
        String tr = bufferedreader.readLine();
        System.out.println("The Content of testout-file.txt file is: ");
        while (tr != null) {
            System.out.println("    " + tr);
            tr = bufferedreader.readLine();
        }
        filereader.close();
        bufferedreader.close();
    }
}