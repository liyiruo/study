package com.网络编程.nio.selector;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * @author liyiruo
 * @Description
 * @Date 2021/1/16 下午3:41
 */
public class SelectorExample {
    public static void main(String[] args) throws IOException {
        // Get the selector
        Selector selector = Selector.open();
        System.out.println("Selector is open for making connection: " + selector.isOpen());
        // Get the server socket channel and register using selector
        ServerSocketChannel SS = ServerSocketChannel.open();
        InetSocketAddress hostAddress = new InetSocketAddress("127.0.0.1", 8080);
        SS.bind(hostAddress);
        SS.configureBlocking(false);
        int ops = SS.validOps();
        SelectionKey selectKy = SS.register(selector, ops, null);
        while (true) {
            System.out.println("Waiting for the select operation...");
            int noOfKeys = selector.select();
            System.out.println("The Number of selected keys are: " + noOfKeys);
            Set<SelectionKey> selectedKeys = selector.selectedKeys();
            Iterator<SelectionKey> selectionKeyIterator = selectedKeys.iterator();
            while (selectionKeyIterator.hasNext()) {

                SelectionKey ky = selectionKeyIterator.next();
                if (ky.isAcceptable()) {
                    SocketChannel client = SS.accept();
                    client.configureBlocking(false);
                    // The new connection is added to a selector
                    client.register(selector, SelectionKey.OP_READ);
                    System.out.println("The new connection is accepted from the client: " + client);
                } else if (ky.isReadable()) {
                    // Data is read from the client
                    SocketChannel client = (SocketChannel) ky.channel();
                    ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                    client.read(byteBuffer);
                    byte[] bytes = byteBuffer.array();
                    String output = new String(bytes).trim();
                    System.out.println("Message read from client: " + output);

                    if (output.equals("Bye Bye")) {
                        client.close();
                        System.out.println("The Client messages are complete; close the session.");
                    }
                }
                selectionKeyIterator.remove();
            }
        }
    }
}
