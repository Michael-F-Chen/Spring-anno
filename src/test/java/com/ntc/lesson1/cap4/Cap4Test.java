package com.ntc.lesson1.cap4;


import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ntc.lesson1.cap4.config.Cap4MainConfig;

public class Cap4Test {

	@Test
	public void test01() {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap4MainConfig.class);
	
		System.out.println("IOC����������ɡ���������");
		String[] names = app.getBeanDefinitionNames();
		
		System.out.println("==============��ӡɨ�������bean��ʼ=================");
		for(String name : names) {
			System.out.println(name);
		}
		
		// �������ص�����£�������Bean���ǲ�����IOC�����bean��
		
//		System.out.println("==============��ӡɨ�������bean����=================");
//		
//		// �������зֱ�ȡ����bean
//		Object bean3 = app.getBean("person");
//		Object bean4 = app.getBean("person");
//		System.out.println("==============person�Ƿ��ǵ�ʵ��=================");
//		System.out.println(bean3 == bean4);
	}
}
