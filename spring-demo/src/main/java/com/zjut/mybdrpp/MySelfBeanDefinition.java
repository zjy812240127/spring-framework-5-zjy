package com.zjut.mybdrpp;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author zoujiayang
 * @date 2022年05月20日
 */
@Component
public class MySelfBeanDefinition extends AbstractBeanDefinition {
	@Override
	public AbstractBeanDefinition cloneBeanDefinition() {
		return null;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MySelfBeanDefinition() {
		System.out.println("通过component Scan注入bean对象......");
	}


	@Override
	public void setParentName(String parentName) {

	}

	@Override
	public String getParentName() {
		return null;
	}
}
