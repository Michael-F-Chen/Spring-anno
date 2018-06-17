package com.ntc.lesson1.cap2;


import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ntc.lesson1.cap2.config.Cap2MainConfig;

public class Cap2Test {

	@Test
	public void test01() {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap2MainConfig.class);
	
		String[] names = app.getBeanDefinitionNames();
		
		System.out.println("==============��ӡɨ�������bean��ʼ=================");
		for(String name : names) {
			System.out.println(name);
		}
		System.out.println("==============��ӡɨ�������bean����=================");

	}
}
