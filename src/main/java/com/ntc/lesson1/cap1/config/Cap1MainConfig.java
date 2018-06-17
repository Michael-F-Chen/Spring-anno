package com.ntc.lesson1.cap1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ntc.lesson1.cap1.Person;

@Configuration
public class Cap1MainConfig {

	/*
	 *  使用@Bean的注解容器中注册bean，beanName默认为方法名，
	 *  可以()中改变beanName
	 */
	@Bean("beanPerson")
	public Person person() {
		return new Person("ntcBean",27);
	}
}
