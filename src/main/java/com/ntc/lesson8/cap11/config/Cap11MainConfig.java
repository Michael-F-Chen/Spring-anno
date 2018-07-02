package com.ntc.lesson8.cap11.config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@ComponentScan("com.ntc.lesson8.cap11")
public class Cap11MainConfig {
	// 创建数据源
	@Bean
	public DataSource dataSource() throws PropertyVetoException{
		// 这个类是c3p0封装了JDBC, dataSource接口的实现
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setUser("root");
		dataSource.setPassword("root");
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
		return dataSource;
	}
	
	// jdbcTemplate能简化增删改查的操作
	@Bean
	public JdbcTemplate jdbcTemplate() throws PropertyVetoException{
		return new JdbcTemplate(dataSource());
	}
}
