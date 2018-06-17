package com.ntc.lesson3.cap7;


import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ntc.lesson3.cap7.config.Cap7MainConfigOfLifyCycle;

public class Cap7Test {

	@Test
	public void test01() {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap7MainConfigOfLifyCycle.class);
		
		System.out.println("IOC容器创建完成。。。。。");
	
		app.close();
	}
}
