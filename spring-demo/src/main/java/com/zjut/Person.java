package com.zjut;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.AbstractRefreshableConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;

import java.io.IOException;

/**
 * @author zoujiayang
 * @date 2022年05月14日
 */
@Component
public class Person  {

	@Autowired
	private MyTestInterface myTestInterface;

	@Component
	class MyTestBeanA{

	}


	public void testMyInterface() {
		myTestInterface.testRegisterResolvableDependency();
	}

	private String name;
	private String address;

	public String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public Person() {
	}


}
