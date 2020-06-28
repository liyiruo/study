package com.设计模式._原型模式;

import java.util.Map;

/**
 * @author liyiruo
 */
public class FileConcreatePrototype extends Prototype {
    public FileConcreatePrototype(Integer fileid, String filename, Map<String, Double> score) {
        super(fileid, filename, score);
        System.out.println("-----构造方法-----");
    }

    public void show() {
        System.out.println("this is filename" + this.getFilename());
        System.out.println("this is fileid" + this.getFileid());
        System.out.println("this is score" + this.getScore());
    }
}
