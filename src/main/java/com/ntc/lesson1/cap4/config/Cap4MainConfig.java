package com.ntc.lesson1.cap4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.ntc.lesson1.cap1.Person;

@Configuration
public class Cap4MainConfig {
	
	@Lazy
	@Bean
	public Person person() {
		System.out.println("�����������person....");
		return new Person("lazy",27);
	}
}
