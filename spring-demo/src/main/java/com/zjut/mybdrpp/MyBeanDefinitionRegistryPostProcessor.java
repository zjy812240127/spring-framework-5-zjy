package com.zjut.mybdrpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.expression.BeanFactoryResolver;

/**
 * @author zoujiayang
 * @date 2022年05月20日
 */
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("执行postProcessBeanDefinitionRegistry -- 》 MyBeanDefinitionRegistryPostProcessor ");
		/**
		 * 调用该方法时新增自定义的后置处理器
		 * 1.首先注入类的defibnition
		 * 2.后续统一进行实例化
		 */

		// BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition("rootBuilder");
		// BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition("mySelfBeanDefinition");
		// builder.addPropertyValue("name", "customiedPropertyName");
		// registry.registerBeanDefinition("mySelfBeanDefinition", builder.getBeanDefinition());
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("执行postProcessBeanFactory -- > MyBeanDefinitionRegistryPostProcessor");
	}
}
