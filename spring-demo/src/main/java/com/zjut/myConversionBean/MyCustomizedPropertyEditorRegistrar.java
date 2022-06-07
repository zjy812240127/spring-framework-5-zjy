package com.zjut.myConversionBean;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

/**
 * @author zoujiayang
 * @date 2022年05月20日
 */
public class MyCustomizedPropertyEditorRegistrar implements PropertyEditorRegistrar {

	/**
	 * 当某个类作为属性内嵌到其他类中时，采用以下绑定的解析类里的方法来解析该字段
	 * @param registry the {@code PropertyEditorRegistry} to register the
	 */
	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(MyInnerBean.class, new MyPropertyEditorSupport());
	}
}
