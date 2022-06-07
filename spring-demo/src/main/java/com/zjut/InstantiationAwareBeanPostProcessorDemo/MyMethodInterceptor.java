package com.zjut.InstantiationAwareBeanPostProcessorDemo;





import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * @author zoujiayang
 * @date 2022年06月01日
 */
public class MyMethodInterceptor implements MethodInterceptor {

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("aop生成代理对象前执行目标方法。。。。。");
		Object o1 = methodProxy.invokeSuper(o, objects);
		return o1;

	}
}
