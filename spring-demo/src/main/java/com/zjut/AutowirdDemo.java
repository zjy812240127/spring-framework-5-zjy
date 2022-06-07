package com.zjut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author zoujiayang
 * @date 2022年05月18日
 */
@Component
public class AutowirdDemo {

	@Autowired
	private Person person;

	private String beanName;

	public AutowirdDemo(String beanName) {
		this.beanName = beanName;
	}

	public AutowirdDemo() {}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
}
