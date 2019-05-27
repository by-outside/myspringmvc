package com.zongyi.utils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

//xml解析
public class XmlUtil {

    public static void textXml() throws DocumentException {
        //加载配置文件
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("D:\\study\\myspringmvc\\src\\main\\java\\User.xml"));
        //获取跟节点（跟节点只有一个）每个节点都是一个Element、跟节点是，子节点也是，子节点的子节点也是...
        Element root = document.getRootElement();
        //节点的子节点是一个集合
        List<Element> beans = root.elements();
        for (Element bean : beans) {
            if (bean.getName().equals("scanner")){
                System.out.println(bean.attributeValue("basepackage"));
            }
        }
    }


    public static void main(String[] args) throws DocumentException {
        textXml();
    }

}
