package com.设计模式._原型模式;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liyiruo
 */
public class Main {
    public static void main(String[] args) {
        String filename = "一个文件";
        Integer fileid=1;
        HashMap<String, Double> fileScores = new HashMap<>();
        fileScores.put("key", 0.99);

        FileConcreatePrototype file =
                new FileConcreatePrototype(fileid, filename, fileScores);
        try {
            //复制2个对象
            FileConcreatePrototype clone1 = (FileConcreatePrototype)file.clone();
            FileConcreatePrototype clone2 = (FileConcreatePrototype)file.clone();
            //给其中的一个赋值，并不影响其他的克隆对象
            Map<String,Double>map=new HashMap<>(0);
            map.put("this", 99.00);
            clone2.setScore(map);
            clone1.show();
            System.out.println("---------------------------");
            clone2.show();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
