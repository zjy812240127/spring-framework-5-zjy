package com.zjut;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @author zoujiayang
 * @date 2022年05月15日
 */
public class PersonPlaceholderBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

	@Override
	protected Class<?> getBeanClass(Element element) {
		return Person.class;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		String name = element.getAttribute("name");
		String address = element.getAttribute("address");
		String id = element.getAttribute("id");

		if (StringUtils.hasText("name")) {
			builder.addPropertyValue("name", name);
		}
		if (StringUtils.hasText("address")) {
			builder.addPropertyValue("address", address);
		}

		if (StringUtils.hasText("id")) {
			builder.addPropertyValue("id", id);
		}

	}
}
