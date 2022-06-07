package com.zjut;

import org.springframework.stereotype.Component;

/**
 * 测试当有多个类实现该接口时，自动注入的是我们自己选择的某个类
 * @author zoujiayang
 * @date 2022年05月18日
 */
@Component
public interface MyTestInterface {

	void testRegisterResolvableDependency();
}
