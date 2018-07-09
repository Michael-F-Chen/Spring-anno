package com.ntc.lesson3.cap7.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Plane implements ApplicationContextAware {
	private ApplicationContext applicationContext;
	
	// 先执行构造方法
	public Plane() {
		System.out.println("Plane constructor........");
	}
	
	// 对象创建并赋值后调用
	@PostConstruct
	private void init() {
		System.out.println("Plane .....  @PostConstruct......");
	}
	
	// 容器移除对象之前回调通知，销毁bean
	@PreDestroy
	private void destroy() {
		System.out.println("Plane .....  @PreDestroy......");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// 将applicationContext传进来，可以拿到
		this.applicationContext = applicationContext;
	}
}
