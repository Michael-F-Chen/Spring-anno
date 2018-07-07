package com.ntc.lesson1.cap4;


import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ntc.lesson1.cap4.config.Cap4MainConfig;

public class Cap4Test {

	@Test
	public void test01() {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap4MainConfig.class);
	
		System.out.println("IOC容器创建完成。。。。。");
		String[] names = app.getBeanDefinitionNames();
		
		System.out.println("==============打印扫描出来的bean开始=================");
		for(String name : names) {
			System.out.println(name);
		}
		
		// 在懒加载的情况下，不调用Bean，是不会向IOC中添加bean的
		
//		System.out.println("==============打印扫描出来的bean结束=================");
//		
//		// 从容器中分别取两次bean
//		Object bean3 = app.getBean("person");
//		Object bean4 = app.getBean("person");
//		System.out.println("==============person是否是单实例=================");
//		System.out.println(bean3 == bean4);
	}
}
