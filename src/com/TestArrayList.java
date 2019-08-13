package com;


import java.util.*;

public class TestArrayList {

    public static void main(String[] args) {
        List  list= new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }




        Collection<String> clist = Collections. unmodifiableCollection(list);
        //clist.add("1");
        System.out.println(clist);
    }
}
