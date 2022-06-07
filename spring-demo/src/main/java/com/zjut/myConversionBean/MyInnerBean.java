package com.zjut.myConversionBean;

import org.springframework.stereotype.Component;

/**
 * 内嵌到其他类的属性中的类
 * @author zoujiayang
 * @date 2022年05月20日
 */

public class MyInnerBean {
	private String name;

	private String address;

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
}
