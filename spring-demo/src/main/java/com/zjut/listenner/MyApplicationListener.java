package com.zjut.listenner;

import com.zjut.listenner.MyEarlyApplicationEvents;
import org.springframework.beans.factory.parsing.*;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author zoujiayang
 * @date 2022年05月19日
 */
public class MyApplicationListener implements ApplicationListener, ReaderEventListener {
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if (event instanceof ApplicationEvent) {
			System.out.println("监听到自定义事件 --- MyEarlyApplicationEvents");
		}
	}


	@Override
	public void defaultsRegistered(DefaultsDefinition defaultsDefinition) {

	}

	@Override
	public void componentRegistered(ComponentDefinition componentDefinition) {
		System.out.println("bean 注入成功，回调方法。。。。。。");
	}

	@Override
	public void aliasRegistered(AliasDefinition aliasDefinition) {

	}

	@Override
	public void importProcessed(ImportDefinition importDefinition) {

	}
}
