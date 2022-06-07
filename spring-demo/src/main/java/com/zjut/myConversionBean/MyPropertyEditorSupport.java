package com.zjut.myConversionBean;

import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;

/**
 * @author zoujiayang
 * @date 2022年05月20日
 */
public class MyPropertyEditorSupport extends PropertyEditorSupport {
	/**
	 * 解析某个类的某个内嵌属性
	 * @param text
	 * @throws IllegalArgumentException
	 */
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] split = text.split("_");
		MyInnerBean myInnerBean = new MyInnerBean();
		/**
		 * 当输入的是分段字符串，说明是设置的多个属性
		 */
		if (split.length > 1) {
			myInnerBean.setName(split[0]);
			myInnerBean.setAddress(split[1]);
		} else {
			myInnerBean.setName(text);
		}
		setValue(myInnerBean);
	}
}
