package com.网络编程.nio;


import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;


/**
 * @author liyiruo
 * @Description   基本字符串
 * @Date 2021/1/16 下午10:46
 */
public class CharsetExample {
    public static void main(String[] args) {
        Charset cs = Charset.forName("UTF-8");
        System.out.println(cs.displayName());
        System.out.println(cs.canEncode());
        String st = "Welcome to yiibai.com, it is Charset test Example.";

        // The conversion of byte buffer from given charset to char buffer in
        ByteBuffer buffer = ByteBuffer.wrap(st.getBytes());
        CharBuffer charBuffer = cs.decode(buffer);

        // The converesion of char buffer from unicode to byte buffer in given
        ByteBuffer newByteBuffer = cs.encode(charBuffer);

        while (newByteBuffer.hasRemaining()) {
            char ca = (char) newByteBuffer.get();
            System.out.print(ca);
        }
        newByteBuffer.clear();
    }
}
