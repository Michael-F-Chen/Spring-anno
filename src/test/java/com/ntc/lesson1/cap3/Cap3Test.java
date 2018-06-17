package com.ntc.lesson1.cap3;


import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ntc.lesson1.cap3.config.Cap3MainConfig;

public class Cap3Test {

	@Test
	public void test02() {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap3MainConfig.class);
	
		String[] names = app.getBeanDefinitionNames();
		
		System.out.println("==============��ӡɨ�������bean��ʼ=================");
		for(String name : names) {
			System.out.println(name);
		}
		System.out.println("==============��ӡɨ�������bean����=================");
		
		// �������зֱ�ȡ����bean
		Object bean3 = app.getBean("person");
		Object bean4 = app.getBean("person");
		System.out.println("==============person�Ƿ��ǵ�ʵ��=================");
		System.out.println(bean3 == bean4);
	}
}
