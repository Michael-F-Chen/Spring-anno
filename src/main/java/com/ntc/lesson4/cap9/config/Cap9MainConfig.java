package com.ntc.lesson4.cap9.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.ntc.lesson4.cap9.dao.TestDao;

@Configuration
@ComponentScan({
	"com.ntc.lesson4.cap9.controller",
	"com.ntc.lesson4.cap9.service",
	"com.ntc.lesson4.cap9.dao"
})
public class Cap9MainConfig {
	
	/*
	 * @Autowired 和  @Bean 同时存在时,
	 * 注册bean是有优先级的，
	 * 优先@Autowired，获取默认的类，
	 * 并且不再执行@Bean，
	 * 如果要执行指定的@Bean，需在@Autowired上使用@Qualifier指明bean的name
	 */
//	@Bean("testDao2")
//	public TestDao testDao(){
//		 TestDao testDao = new TestDao();
//		 testDao.setFlag("2");
//		 return testDao;
//	}
	
	/*
	 * @Primary优先级较高（首选项）
	 * Spring进行自装配的时候默认首选的bean
	 */
	@Primary
	@Bean("testDao2")
	public TestDao testDao(){
		 TestDao testDao = new TestDao();
		 testDao.setFlag("2");
		 return testDao;
	}
}
