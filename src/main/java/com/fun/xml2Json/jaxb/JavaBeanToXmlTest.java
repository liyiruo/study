package com.fun.xml2Json.jaxb;

import java.util.Date;

/**
 * @author liyiruo
 * @Description
 * @Date 2021/6/22 下午5:10
 */
public class JavaBeanToXmlTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.setId(100);
        book.setAuthor("James");
        book.setDate(new Date());
        book.setPrice(23.45f);  //默认是0.0
        String str = JaxbUtil.convertToXml(book);
        System.out.println(str);
    }

}


