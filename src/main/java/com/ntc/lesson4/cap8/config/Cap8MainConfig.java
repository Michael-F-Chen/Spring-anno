package com.ntc.lesson4.cap8.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.ntc.lesson4.cap8.bean.Bird;

@Configuration
@PropertySource(value="classpath:/lesson4_cap8_value.propperties")
// @PropertySource 读取配置文件
public class Cap8MainConfig {

	@Bean
	public Bird bird() {
		return new Bird();
	}	
}
