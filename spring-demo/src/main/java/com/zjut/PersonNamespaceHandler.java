package com.zjut;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;
import org.springframework.context.config.ContextNamespaceHandler;

/**
 * @author zoujiayang
 * @date 2022年05月15日
 */
public class PersonNamespaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionParser("user", new PersonPlaceholderBeanDefinitionParser());
	}
}
