package com.zjut.launcher;


import com.zjut.MyClassPathXmlApplicationContext;
import com.zjut.MyTestInterface;
import com.zjut.Person;
import com.zjut.listenner.Event;
import com.zjut.listenner.MyApplicationEventMulticaster;
import com.zjut.listenner.MyEarlyApplicationEvents;
import com.zjut.myConversionBean.MyConversionBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;

/**
 * @author zoujiayang
 * @date 2022年05月14日
 */
public class DemoStart {

	@Autowired
	private MyTestInterface myTestInterface;

	@Autowired
	private Person person;

	/**
	 *
	 * spring得到bean对象的五种方法
	 * 1. beanPostProcessor 后置处理器方法 aop 调用enhancer类生成代理类对象
	 * 2. supplier方法
	 * 3. 工厂方法，xml文件中bean的属性定义一个工厂方法，
	 * 定义一个或者多个类的一个或者多个方法重写该属性绑定的方法，spring会加权算法选择最合适的方法来生成该bean（静态工厂方法，不需要一个bean工厂对象来调用方法）
	 * xml文件bean属性定义一个工厂bean并绑定该bean 的一个方法，通过该方法得到该bean对象（动态工厂方法，需要有一个工厂bean对象调用该方法）
	 * 4. 工厂bean调用他的 getObject() 方法来得到bean对象
	 * 5. 反射获取
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// ApplicationContext context = new MyClassPathXmlApplicationContext("demo.xml");
		// MyConversionBean myConversionBean = (MyConversionBean) context.getBean("myConversionBean");
		// System.out.println(myConversionBean.getInnerBean().getName() + "..." + myConversionBean.getInnerBean().getAddress());
		// Person person = (Person) context.getBean("person");
		// System.out.println(person.getName() + "-->" + person.getAddress());
		// MyApplicationEventMulticaster myApplicationEventMulticaster = (MyApplicationEventMulticaster) context.getBean("myApplicationEventMulticaster");
		// myApplicationEventMulticaster.multicastEvent(new ApplicationEvent(new Event("自定义事件")) {
		// }, null);
		// System.out.println("end......");

		ApplicationContext context = new MyClassPathXmlApplicationContext("demo.xml");
		Object a = context.getBean("a");
		// System.out.println(a);


	}


	public void test() {
		myTestInterface.testRegisterResolvableDependency();
	}
}
