package com.fun.xml2properties2;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

/**
 * @author liyiruo
 * @Description
 * @Date 2021/2/9 下午1:45
 */
public class DomDemo {
    public static void main(String[] args) {
        try {
            SAXReader saxReader = new SAXReader();
            Document document = saxReader.read(new File("/Users/liyiruo/IdeaProjects/study/src/main/java/com/fun/xml2properties2/select.xml"));
            Properties p = new Properties();
            List<Element> list = document.getRootElement().elements("string");
            for (Element e : list) {
                p.setProperty(e.attributeValue("name"), e.getTextTrim());
                System.out.println(e.attributeValue("name"));
                System.out.println(e.attributeValue("value"));
            }
            p.store(new FileOutputStream("输出properties文件路径"), "");
        } catch (DocumentException ex) {
            ex.printStackTrace(System.err);
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }
}
