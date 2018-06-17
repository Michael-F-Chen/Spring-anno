package com.ntc.lesson1.cap1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXmlBean {
	public static void main(String argus[]) {
		// 获取lesson1_cap1_beans.xml注册的bean
		ApplicationContext app = new ClassPathXmlApplicationContext("lesson1_cap1_beans.xml");
		
		Person person = (Person) app.getBean("person");
		System.out.println(person.getName());
	}
}
