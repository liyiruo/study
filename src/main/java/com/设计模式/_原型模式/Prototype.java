package com.设计模式._原型模式;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liyiruo
 */
public class Prototype implements Cloneable {
    private Integer  fileid;
    private String filename;
    private Map<String, Double>score;

    public Integer getFileid() {
        return fileid;
    }

    public void setFileid(Integer fileid) {
        this.fileid = fileid;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Map<String, Double> getScore() {
        return score;
    }

    public void setScore(Map<String, Double> score) {
        this.score = score;
    }

    public Prototype(Integer fileid, String filename, Map<String, Double> score) {
        this.fileid = fileid;
        this.filename = filename;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "fileid=" + fileid +
                ", filename='" + filename + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        Prototype filePrototype=null;
        try {
            //克隆基本数据类型
            filePrototype = (Prototype) super.clone();
            //
            filePrototype.score=(Map<String, Double>)((HashMap<String, Double>)this.score).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return filePrototype;
    }

}
