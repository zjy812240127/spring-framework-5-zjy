package com.zjut.myConversionBean;

/**
 * @author zoujiayang
 * @date 2022年05月20日
 */
public class MyConversionBean {
	private MyInnerBean innerBean;

	private String name;

	public MyInnerBean getInnerBean() {
		return innerBean;
	}

	public void setInnerBean(MyInnerBean innerBean) {
		this.innerBean = innerBean;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
