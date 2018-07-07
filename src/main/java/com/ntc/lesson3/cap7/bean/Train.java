package com.ntc.lesson3.cap7.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/*
 * 实现InitializingBean和DisposableBean实现初始化和销毁方法
 */
@Component	// 如果在MainConfig里使用@Bean，则不需声明
public class Train implements InitializingBean, DisposableBean{

	public Train() {
		System.out.println("Trian...constructor...");
	}
	
	// 当bean销毁时调用
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Train.....destroy....");
	}

	// 在bean属性赋值和初始化完成之后调用，相当于初始化方法
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Train....afterPropertiesSet..");
	}

}
