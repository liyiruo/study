package com.fun.xml2Json.jaxb;

/**
 * @author liyiruo
 * @Description
 * @Date 2021/6/22 下午5:09
 */
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "BOOK", propOrder = {})
public class Book {

    @XmlAttribute
    private Integer id;

    @XmlElement(required = true)
    private float price;

    @XmlElement(required = true)
    private String author;

    @XmlElement
    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", price=" + price + ", author=" + author + ", date=" + date + "]";
    }


}

