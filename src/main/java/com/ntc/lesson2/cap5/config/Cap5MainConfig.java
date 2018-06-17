package com.ntc.lesson2.cap5.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.ntc.lesson1.cap1.Person;

@Configuration
public class Cap5MainConfig {
	
	// @Conditional(WinCondition.class) 根据 WinCondition.class里的条件判断是否注册bean
	
	@Bean("person")
	public Person person() {
		System.out.println("给容器中添加person....");
		return new Person("person",27);
	}
	
	@Conditional(WinCondition.class)
	@Bean("ntc")
	public Person ntc() {
		System.out.println("给容器中添加ntc....");
		return new Person("ntc",27);
	}
	
	@Conditional(LinCondition.class)
	@Bean("james")
	public Person james() {
		System.out.println("给容器中添加james.....");
		return new Person("james",27);
	}

}
