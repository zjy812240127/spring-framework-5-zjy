package com.zjut;

import org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader;
import org.w3c.dom.Element;

/**
 * @author zoujiayang
 * @date 2022年05月19日
 */
public class MyDocumentDefinitionReader extends DefaultBeanDefinitionDocumentReader {

	@Override
	protected void preProcessXml(Element root) {
		System.out.println("解析xml文件前执行......");

	}

	@Override
	protected void postProcessXml(Element root) {
		System.out.println("加载完xml文件后执行......");

	}
}
