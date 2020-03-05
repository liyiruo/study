package com;

public class TestFind {


    public static int find(int[] array) {
        //一共有0-n的数字 少了一个    则一个n个数字
        int len = array.length;
        //1 到n个数字和为
        int sum = (len + 1) * len / 2;
        System.out.println("sum===>" + sum);
        for (int i = 0; i < len; i++) {
            sum -= array[i];
        }
        return sum;
    }


    public static int find2(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result ^ array[i] ^ i;
            //System.out.println("result====>"+result+";;;"+i);
        }
        result = result ^ (array.length);
        return result;
    }


    public static void main(String[] args) {

        int[] a = {0, 2, 3, 1, 4, 6, 7, 9, 8, 10};
        int b = find2(a);
        System.out.println(b);
    }


}
