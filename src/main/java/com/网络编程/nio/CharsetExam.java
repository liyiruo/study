package com.网络编程.nio;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/**
 * @author liyiruo
 * @Description
 * @Date 2021/1/16 下午11:05
 */
public class CharsetExam {
    public static void main(String[] args) throws CharacterCodingException {
        Charset cs = Charset.forName("utf-8");
        CharsetEncoder csencoder = cs.newEncoder();
        CharsetDecoder csdecoder = cs.newDecoder();
        String st = "Example of Encode and Decode in Java NIO.";

        ByteBuffer bb = ByteBuffer.wrap(st.getBytes());
        CharBuffer charBuffer = csdecoder.decode(bb);
        ByteBuffer newbb = csencoder.encode(charBuffer);

        while (newbb.hasRemaining()) {
            char ca = (char) newbb.get();
            System.out.print(ca);
        }
        newbb.clear();
    }
}
