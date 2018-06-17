package com.ntc.lesson3.cap7.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ntc.lesson1.cap1.Person;
import com.ntc.lesson3.cap7.bean.Bike;

@Configuration
@ComponentScan("com.ntc.lesson3.cap7.bean")
public class Cap7MainConfigOfLifyCycle {

	@Bean
	public Person person() {
		return new Person("person",27);
	}	
	
	@Bean(initMethod="init",destroyMethod="destroy")
	public Bike bike() {
		return new Bike();
	}
}
