package com.zjut;

import com.zjut.listenner.Event;
import com.zjut.listenner.MyApplicationEventMulticaster;
import com.zjut.listenner.MyApplicationListener;
import com.zjut.listenner.MyEarlyApplicationEvents;
import com.zjut.mybdrpp.MyBeanDefinitionRegistryPostProcessor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zoujiayang
 * @date 2022年05月18日
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXmlApplicationContext(String context) {
		super(context);
	}

	public MyClassPathXmlApplicationContext() {
	}

	@Override
	protected void onRefresh() throws BeansException {
		System.out.println("subClass excute onRefresh...在onrefresh()阶段 --- 》 发布我的自定义事件");
		MyApplicationEventMulticaster myApplicationEventMulticaster = (MyApplicationEventMulticaster) getBeanFactory().getBean("myApplicationEventMulticaster");
		myApplicationEventMulticaster.multicastEvent(new MyEarlyApplicationEvents(new Event("myEvent")));

	}

	/**
	 * 自定义xml文件定义读取类，可以扩展在解析xml文件前后分别执行自己想要执行的内容
	 * @param reader the bean definition reader used by this context
	 */
	@Override
	protected void initBeanDefinitionReader(XmlBeanDefinitionReader reader) {
		reader.setDocumentReaderClass(MyDocumentDefinitionReader.class);
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		super.customizeBeanFactory(beanFactory);
		super.addApplicationListener(new MyApplicationListener());
		super.addBeanFactoryPostProcessor(new MyBeanDefinitionRegistryPostProcessor());
	}


}
