package com.zjut;

import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.xml.BeanDefinitionDocumentReader;
import org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader;
import org.springframework.beans.factory.xml.XmlReaderContext;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * @author zoujiayang
 * @date 2022年05月18日
 */
public class MyBeanDefinitionDocumentReader extends DefaultBeanDefinitionDocumentReader {
	@Override
	protected void postProcessXml(Element root) {
		super.postProcessXml(root);
		System.out.println("******************************");
	}


}
