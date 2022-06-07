package com.zjut.listenner;

import org.springframework.context.ApplicationEvent;

/**
 * @author zoujiayang
 * @date 2022年05月20日
 */
public class MyEarlyApplicationEvents extends ApplicationEvent {
	/**
	 * Create a new ApplicationEvent.
	 *
	 * @param source the object on which the event initially occurred (never {@code null})
	 */
	public MyEarlyApplicationEvents(Object source) {
		super(source);
		System.out.println("MyEarlyApplicationEvents......");
	}
}
