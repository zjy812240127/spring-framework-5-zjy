package com.hik.web.controller;

import com.hik.web.entity.MyBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zoujiayang
 * @date 2022年05月20日
 */
public class TestController {

	@RequestMapping("sayHello")
	@ResponseBody
	public ModelAndView sayHello(int age, String name) {
		ModelAndView mav = new ModelAndView();
		MyBean bean = new MyBean(age, name);
		mav.addObject("myBean", bean);
		mav.setViewName("sayHello");
		System.out.println(bean.toString());
		return mav;
	}

}
