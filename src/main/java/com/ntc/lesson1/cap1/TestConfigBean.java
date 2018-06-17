package com.ntc.lesson1.cap1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ntc.lesson1.cap1.config.Cap1MainConfig;

public class TestConfigBean {

	public static void Main(String args[]) {
		// 获取Configuration注解注册的bean
		ApplicationContext app = new AnnotationConfigApplicationContext(Cap1MainConfig.class);
		
		Person person = (Person) app.getBean("@beanPerson");
		System.out.println(person);
		
		String[] namesForBean = app.getBeanNamesForType(Person.class);
		for(String name : namesForBean) {
			System.out.println(name);
		}
	}
}
