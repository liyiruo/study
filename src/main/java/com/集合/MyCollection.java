package com.集合;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MyCollection {
    public static void main(String[] args) {

        Iterable iterable=new Iterable() {
            @Override
            public Iterator iterator() {
                return null;
            }
        };
        //collection 是Iterator的子接口
        Iterator iterator=new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };




        //集合中的顶级接口
        Collection collection=new Collection() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public Object[] toArray(Object[] a) {
                return new Object[0];
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(Collection c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

        //List 和 set 是Collection 接口的子接口

            //list 的实现类
        List list=new LinkedList();
        List list2=new ArrayList();
        List list3 = new Vector();

        Vector vector = new Stack();

            //set
        Set set1=new TreeSet();
        Set set=new HashSet();

        HashSet hashSet = new LinkedHashSet();



            //Map
        Map map=new HashMap();
        Map map1 = new TreeMap();
        Map map2=new LinkedHashMap();
        Map map3 = new Hashtable();
        Map map4 = new ConcurrentHashMap();


        Hashtable hashtable = new Properties();


    }
}
