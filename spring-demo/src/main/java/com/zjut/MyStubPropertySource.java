package com.zjut;

import org.springframework.core.env.PropertySource;

/**
 * @author zoujiayang
 * @date 2022年05月19日
 */
public class MyStubPropertySource extends PropertySource.StubPropertySource {

	public MyStubPropertySource(String name) {
		super(name, new Object());
		System.out.println("stub property......");
	}


}
