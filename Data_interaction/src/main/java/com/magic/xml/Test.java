package com.magic.xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Iterator;
import java.util.List;

/**
 * com.magic.xml
 *
 * @author jh
 * @date 2018/9/5 10:03
 * description:读取xml，解析xml
 */
public class Test {
	static String filename="C:\\Users\\jh\\IdeaProjects\\Learn_Most\\Data_interaction\\src\\main\\java\\com\\magic\\xml\\stu.xml";
	public static void main(String[] args) throws DocumentException {
		SAXReader saxReader = new SAXReader ();
		Document read = saxReader.read (new File (filename));
		Element rootElement = read.getRootElement ();
		getNodes(rootElement);

	}

	public static void getNodes(Element element){
		System.out.println ("节点名称： " + element.getName ());
		List<Attribute> attributes = element.attributes ();
		for (Attribute attribute : attributes) {
			System.out.println("属性:" + attribute.getName() + "---" + attribute.getText());
		}

		if (!element.getTextTrim().equals("")) {
			System.out.println(element.getName() + "--" + element.getText());
		}
		// 使用迭代器遍历
		Iterator<Element> elementIterator = element.elementIterator();
		while (elementIterator.hasNext()) {
			Element next = elementIterator.next();
			getNodes(next);
		}


	}
}
