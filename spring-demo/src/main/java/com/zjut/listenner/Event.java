package com.zjut.listenner;

import com.zjut.MyClassPathXmlApplicationContext;
import org.springframework.context.ApplicationEvent;

/**
 * @author zoujiayang
 * @date 2022年05月20日
 */

public class Event extends ApplicationEvent {

	private String eventName;

	public Event(String eventName) {
		super(MyClassPathXmlApplicationContext.class);
		this.eventName = eventName;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
}
