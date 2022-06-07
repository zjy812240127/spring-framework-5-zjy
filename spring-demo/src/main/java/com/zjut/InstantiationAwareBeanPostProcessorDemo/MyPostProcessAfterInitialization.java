package com.zjut.InstantiationAwareBeanPostProcessorDemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author zoujiayang
 * @date 2022年06月01日
 */
public class MyPostProcessAfterInitialization implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("对动态代理对象" + beanName + "进行后置处理-----------");
		return bean;
	}
}
