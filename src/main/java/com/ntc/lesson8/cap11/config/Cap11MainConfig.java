package com.ntc.lesson8.cap11.config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.AnnotationTransactionAttributeSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/*
 * InfrastructureAdvisorAutoProxyCreator
 * 1,注册 
 * 2，利用后置处理器机制在创建以后，包装对象，返回一个代理对象（增强），代理对象执行方法时，利用拦截器进行调用
 * 
 * AnnotationTransactionAttributeSource：事物增强器要用事物注解的信息，使用这个类进行解析
 * 
 * TransactionInterceptor 保存事物属性信息，事物管理器  MethodInterceptor
 * 当执行目标方法时 ：
 * 		执行拦截链
 * 		事务拦截器：
 * 			1，先获取事务相关属性
 * 			2，获取PlateformTransactionManager事务管理器，直接到容器中获取PlateformTransactionManager  bean实例
 * 执行目标方法：
 * 		如果异常：complateTranscationAfterThrowing,利用事务管理器进行回滚
 * 		如果正常：利用事务管理器，提交事务
 * 事务管理器：
 * 
 */
@Configuration
@ComponentScan("com.ntc.lesson8.cap11")
@EnableTransactionManagement	// 开启事物管理功能，使@Transcational起作用
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
	
	// 注册事物管理器
	@Bean
	public PlatformTransactionManager platformTransactionManager() throws PropertyVetoException{
		return new DataSourceTransactionManager(dataSource());
	}
}
