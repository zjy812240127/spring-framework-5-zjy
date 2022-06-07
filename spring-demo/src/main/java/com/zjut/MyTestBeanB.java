package com.zjut;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * @author zoujiayang
 * @date 2022年05月18日
 */
@Component
@Import(MyTestBeanA.class)
public class MyTestBeanB implements MyTestInterface{
	@Override
	public void testRegisterResolvableDependency() {
		System.out.println("BBBBBB");
	}


}
