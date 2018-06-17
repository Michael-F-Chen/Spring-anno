package com.ntc.lesson3.cap7.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
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

	// 在bean属性赋值和初始化完成之后调用
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Train....afterPropertiesSet..");
	}

}
