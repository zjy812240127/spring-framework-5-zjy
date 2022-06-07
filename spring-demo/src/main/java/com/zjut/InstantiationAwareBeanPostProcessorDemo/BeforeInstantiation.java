package com.zjut.InstantiationAwareBeanPostProcessorDemo;

/**
 * @author zoujiayang
 * @date 2022年06月01日
 */
public class BeforeInstantiation {
	public void doSomething() {
		System.out.println("生成代理对象前生成的包装对象。。。。。。");
	}
}
