package com.ntc.lesson1.cap4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.ntc.lesson1.cap1.Person;

@Configuration
public class Cap4MainConfig {
	/*
	 * 懒加载：主要正对单实例bean:默认在容器启动时创建的对象
	 * 懒加载：容器启动时不创建对象，仅当第一次使用（获取）bean的时候才创建被初始化
	 */
	@Lazy
	@Bean
	public Person person() {
		System.out.println("给容器中添加person....");
		return new Person("lazy",27);
	}
}
