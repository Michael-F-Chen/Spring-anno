package com.ntc.lesson5.cap10;


import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ntc.lesson5.cap10.aop.Calculator;
import com.ntc.lesson5.cap10.config.Cap10MainConfig;

public class Cap10Test {

	@Test
	public void test01() {
 		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap10MainConfig.class);
			
 		Calculator calculator = app.getBean(Calculator.class);
 		calculator.div(10, 2);
 		
		app.close();
	}
}
