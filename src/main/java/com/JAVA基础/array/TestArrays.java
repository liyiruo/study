package main.java.com.JAVA基础.array;

import java.util.Arrays;
import java.util.List;

public class TestArrays {

    public static void main(String[] args) {
        int[] arr=new int[6];
        arr[0]=1;
        arr[1]=1;
        arr[2]=1;
        arr[3]=1;

        System.out.println("arr的长度"+arr.length);
        List list = Arrays.asList(arr);
        System.out.println("list====>" + list.size());
        System.out.println("list.get(0)====>" + list.get(0));
    }
}
