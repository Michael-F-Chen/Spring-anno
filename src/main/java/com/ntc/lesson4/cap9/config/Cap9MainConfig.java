package com.ntc.lesson4.cap9.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ntc.lesson4.cap9.dao.TestDao;

@Configuration
@ComponentScan({
	"com.ntc.lesson4.cap9.controller",
	"com.ntc.lesson4.cap9.service",
	"com.ntc.lesson4.cap9.dao"
})
public class Cap9MainConfig {
	
	@Bean("testDao2")
	public TestDao testDao(){
		return new TestDao();
	}
}
