package com.zjut;

import org.springframework.stereotype.Component;

/**
 * @author zoujiayang
 * @date 2022年05月18日
 */
@Component
public class MyTestBeanA implements MyTestInterface {

	@Override
	public void testRegisterResolvableDependency() {
		System.out.println("AAAAAA");
	}
}
