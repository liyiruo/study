package com.fun.base64;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.*;
import java.util.Base64;

/**
 * @author liyiruo
 * @Description
 * @Date 2021/3/19 下午4:59
 */
public class TransBase64 {
    public static void main(String[] args) throws IOException {
        String path = "";
        //获取文件，获取字节，加密，返回字符串

        String str = "123456";
        String encode = new BASE64Encoder().encode(str.getBytes());
        System.out.println("编码过后：" + encode);
        byte[] bytes = new BASE64Decoder().decodeBuffer(encode);
        String decode = new String(bytes, "UTF-8");
        System.out.println("解码过后：" + decode);

    }

    /**
     * 根据路径获取路径对应资源的字节数组
     */
    public static String getsec1(String path) {
        File file = new File(path);
        byte[] buffer = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] b = new byte[1024];
            int n;
            while ((n = fis.read(b)) != -1) {
                bos.write(b, 0, n);
            }
            fis.close();
            bos.close();
            buffer = bos.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer.toString();
    }

    public static String getPath() {
        return "";
    }


    /**
     * 给一个字符串 返回一个加密后的字符串
     */
    public String getsec(String befStr) {
        return new BASE64Encoder().encode(befStr.getBytes());
    }

    /**
     * 对一个字符串解密 返回解密后的字符串
     *
     * @param sec
     * @return
     * @throws IOException
     */
    public String getStr(String sec) throws IOException {
        byte[] bytes = new BASE64Decoder().decodeBuffer(sec);
        String decode = new String(bytes, "UTF-8");
        return decode;
    }


}

