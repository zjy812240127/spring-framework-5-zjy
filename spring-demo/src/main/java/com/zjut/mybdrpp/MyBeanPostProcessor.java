package com.zjut.mybdrpp;

import com.zjut.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author zoujiayang
 * @date 2022年05月18日
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object object, String beanName) throws BeansException {
		if (object instanceof Person) {
			System.out.println("执行自定义的beanPostProcessor {" + object.getClass() + "} 的后置处理器方法" );
		}
		return object;
	}
}
