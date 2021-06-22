package com.fun.xml2Json.jaxb;

/**
 * @author liyiruo
 * @Description
 * @Date 2021/6/22 下午5:14
 */


import java.util.Date;
public class XmlBeanToJavaTest {

    public static void main(String[] args) {

        String str = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" +
                "<book id=\"100\">" +
                "  <author>James</author>" +
                "  <date>2019-04-17T16:11:22.326+08:00</date>" +
                "  <price_1>23.45</price_1>" +
                "  <price>23.45</price>" +
                "</book>";
        Book book = JaxbUtil.converyToJavaBean(str, Book.class);
        System.out.println(book);

    }

}


