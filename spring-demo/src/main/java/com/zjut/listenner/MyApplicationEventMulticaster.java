package com.zjut.listenner;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.ResolvableType;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.lang.Nullable;

import java.util.Date;
import java.util.concurrent.Executor;

/**
 * @author zoujiayang
 * @date 2022年05月19日
 */
public class MyApplicationEventMulticaster extends SimpleApplicationEventMulticaster {


	@Override
	public void addApplicationListener(ApplicationListener<?> listener) {
		ApplicationListener<ApplicationEvent> applicationEventApplicationListener = new ApplicationListener<ApplicationEvent>() {
			@Override
			public void onApplicationEvent(ApplicationEvent event) {
				if (event instanceof MyEarlyApplicationEvents) {
					long timestamp = event.getTimestamp();
					System.out.println("在时间戳" + timestamp + "时，监听到 --- MyEarlyApplicationEvents");
				}
			}
		};
	}


	@Override
	public void addApplicationListenerBean(String listenerBeanName) {

		System.out.println("通过自定义的事件多播器加载事件监听器......");
		this.addApplicationListenerBean(listenerBeanName);

	}

	@Override
	public void removeApplicationListener(ApplicationListener<?> listener) {

	}

	@Override
	public void removeApplicationListenerBean(String listenerBeanName) {

	}

	@Override
	public void removeAllListeners() {

	}

	@Override
	public void multicastEvent(ApplicationEvent event) {
		if (event != null) {
			System.out.println("执行自定义的事件多播器来发布事件-----------》》》》》》》------------");
		}
		multicastEvent(event, resolveDefaultEventType(event));
	}

	@Override
	public void multicastEvent(ApplicationEvent event, ResolvableType eventType) {
		System.out.println("发布事件：" + event.getSource() + "------------------------------------");
		ResolvableType type = (eventType != null ? eventType : resolveDefaultEventType(event));
		Executor executor = getTaskExecutor();
		for (ApplicationListener<?> listener : getApplicationListeners(event, type)) {
			if (executor != null) {
				executor.execute(() -> invokeListener(listener, event));
			}
			else {
				invokeListener(listener, event);
			}
		}

	}

	private ResolvableType resolveDefaultEventType(ApplicationEvent event) {
		return ResolvableType.forInstance(event);
	}

}
