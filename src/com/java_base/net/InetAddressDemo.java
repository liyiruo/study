package com.java_base.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 獲取主機名稱和地址
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        function();
        function_1();
    }
    /**
   * 獲取本地IP地址和用戶名
     * @throws UnknownHostException
     */
    public static void function() throws UnknownHostException {
        //獲取到的用戶名和ip
        InetAddress address = InetAddress.getLocalHost();
        //ip地址
        System.out.println(address.getHostAddress());
        //主機名稱
        System.out.println(address.getHostName());
    }
    /**
     *獲取別人的ip地址
     */
    public static void function_1() throws UnknownHostException {
        InetAddress address = InetAddress.getByName("DESKTOP-O3F3UF6");
        //InetAddress address1 = InetAddress.getByName("192.168.0.1");
        System.out.println(address);
    }
}

