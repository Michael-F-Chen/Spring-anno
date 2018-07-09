package com.ntc.lesson3.cap7;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ntc.lesson3.cap7.config.Cap7MainConfigOfLifyCycle;

public class Cap7Test {

	@Test
	@Autowired
	public void test01() {
		// 申明IOC容器
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap7MainConfigOfLifyCycle.class);
		System.out.println("IOC容器创建完成。。。。。");
		
		// 单例模式下，当关闭容器的时候（app.close()）bean会被销毁
		
		// 当多例模式下，只有获取bean的时候才会初始化
		// 当多例模式下，容器只负责初始化,但不会管理bean, 容器关闭不会调用销毁方法
		// app.getBean("bike"); //此时才会调用初始化
		
		app.close();
	}
}
