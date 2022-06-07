package com.zjut;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.parsing.BeanComponentDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @author zoujiayang
 * @date 2022年05月19日
 */
public class MyTagBean extends AbstractSingleBeanDefinitionParser {

	@Override
	protected Class<?> getBeanClass(Element element) {
		return Person.class;
	}

	@Override
	public void postProcessComponentDefinition(BeanComponentDefinition componentDefinition) {
		System.out.println("解析完bean定义信息后执行的后置处理......");
	}


	@Override
	protected void doParse(Element element, ParserContext parserContext, BeanDefinitionBuilder builder) {
		// 父类定义的通用的标签属性解析
		String name = element.getAttribute("name");
		String address = element.getAttribute("address");

		if (StringUtils.hasText("name")) {
			builder.addPropertyValue("name", name);
			builder.addPropertyValue("address", address);
		}
		// String fileEncoding = element.getAttribute("file-encoding");
		// if (StringUtils.hasLength(fileEncoding)) {
		// 	builder.addPropertyValue("fileEncoding", fileEncoding);
		// }
		//
		// String order = element.getAttribute("order");
		// if (StringUtils.hasLength(order)) {
		// 	builder.addPropertyValue("order", Integer.valueOf(order));
		// }
		//
		// builder.addPropertyValue("ignoreResourceNotFound",
		// 		Boolean.valueOf(element.getAttribute("ignore-resource-not-found")));
		//
		// builder.addPropertyValue("localOverride",
		// 		Boolean.valueOf(element.getAttribute("local-override")));
		//
		// builder.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
	}

}
