package com.fun.base64;

import io.netty.util.CharsetUtil;
import org.springframework.util.FileCopyUtils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class File2Bytes {
    public static void main(String[] args){
        File file  = new File("/Users/liyiruo/IdeaProjects/study/src/main/java/com/fun/base64/a.txt");
        String xx = file2BinStr(file);
        System.out.println(xx);
        File xFile = bin2File(xx,"b.txt","/Users/liyiruo/IdeaProjects/study/src/main/java/com/fun/base64/");
        System.out.println(xFile.getAbsolutePath());
    }

    /**
     * 文件转为二进制数组
     * @param file
     * @return bytes
     */
    public static byte[] file2BinArray(File file){
        try {
            InputStream fis = new FileInputStream(file);
            byte[] bytes = FileCopyUtils.copyToByteArray(fis);
            return bytes;
        }catch (Exception ex){
            throw new RuntimeException("转换异常",ex);
        }
    }

    /**
     * 文件转为二进制字符串
     * @param file
     * @return
     */
    public static String file2BinStr(File file){
        try {
            InputStream fis = new FileInputStream(file);
            byte[] bytes = FileCopyUtils.copyToByteArray(fis);
            return new String(bytes, CharsetUtil.UTF_8);
        }catch (Exception ex){
            throw new RuntimeException("转换异常",ex);
        }
    }


    /**
     * 二进制字符串转文件
     */
    public static File bin2File(String bin,String fileName,String path){
        try {
            File file = new File(path,fileName);
            file.createNewFile();
            byte[] bytes1 = bin.getBytes(CharsetUtil.UTF_8);
            FileCopyUtils.copy(bytes1,file);

            //FileOutputStream outs = new FileOutputStream(file);
            //outs.write(bytes1);
            //outs.flush();
            //outs.close();

            return file;
        }catch (Exception ex){
            throw new RuntimeException("转换出错",ex);
        }
    }

    /**
     * 文件转为二进制数组
     */
    public static byte[] getFile2Byte(File file) {
        byte[] by = new byte[(int) file.length()];
        try {
            InputStream is = new FileInputStream(file);
            ByteArrayOutputStream bytestream = new ByteArrayOutputStream();
            byte[] bb = new byte[2048];
            int ch;
            ch = is.read(bb);
            while (ch != -1) {
                bytestream.write(bb, 0, ch);
                ch = is.read(bb);
            }
            by = bytestream.toByteArray();
        } catch (Exception ex) {
            throw new RuntimeException("转换出错",ex);
        }
        return by;
    }

}
