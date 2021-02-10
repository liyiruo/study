package com.fun.xml2properties3;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;
import java.util.Properties;

/**
 * @author liyiruo
 * @Description
 * @Date 2021/2/9 下午1:45
 */
public class DomDemo {
    public static void main(String[] args) {
        System.out.println(DomDemo.class.getClassLoader().getResource("").getPath());
        try {
            SAXReader saxReader = new SAXReader();
            Document document = saxReader.read(new File("/Users/liyiruo/IdeaProjects/study/src/main/java/com/fun/xml2properties3/select.xml"));
            Properties p = new Properties();
            List<Element> list = document.getRootElement().elements("select");
            for (Element e : list) {
                String id = e.attributeValue("id");
                //System.out.println("id=======>" + id);
                List elements = e.elements("string");

                for (int i = 0; i < elements.size(); i++) {
                    Element o = (Element)elements.get(i);
                    //System.out.println("o===>"+o.toString());
                    List attributes = o.attributes();
                    Attribute o1 = (Attribute)attributes.get(0);
                    //System.out.println(o1.getValue());
                    Attribute o2 = (Attribute)attributes.get(1);
                    //System.out.println(o2.getValue());
                    System.out.println(id.concat(".").concat(o1.getValue().concat("=")).concat(o2.getValue()));
                }
            }

        } catch (DocumentException ex) {
            ex.printStackTrace(System.err);
        }
    }
}
