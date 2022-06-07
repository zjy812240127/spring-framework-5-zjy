package com.zjut.InstantiationAwareBeanPostProcessorDemo;

import com.zjut.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.cglib.proxy.Enhancer;

/**
 * @author zoujiayang
 * @date 2022年06月01日
 */
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		/**  利用enhancer动态代理生成bean创建前的包装对象  */
		Enhancer enhancer = new Enhancer();
		// 获取原生对象
		enhancer.setSuperclass(beanClass);
		// 执行拦截器的回调方法，对原生对象进行包装
		enhancer.setCallback(new MyMethodInterceptor());
		BeforeInstantiation beforeInstantiation = (BeforeInstantiation) enhancer.create();
		return beforeInstantiation;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		return false;
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		return null;
	}
}
