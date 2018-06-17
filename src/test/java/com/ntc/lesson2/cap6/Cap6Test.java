package com.ntc.lesson2.cap6;


import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ntc.lesson2.cap6.config.Cap6MainConfig;

public class Cap6Test {

	@Test
	public void test01() {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap6MainConfig.class);
		
		System.out.println("IOC容器创建完成。。。。。");
		
//		Object bean1 = app.getBean("&ntcFactoryBean");
		Object bean1 = app.getBean("ntcFactoryBean");
		System.out.println("bean1的类型=" + bean1.getClass());
		
		String[] names = app.getBeanDefinitionNames();
		for(String name : names) {
			System.out.println(name);
		}
	}
}
