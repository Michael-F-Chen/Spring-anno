package com.ntc.lesson5.cap10.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.ntc.lesson5.cap10.aop.Calculator;
import com.ntc.lesson5.cap10.aop.LogAspects;

/*
 * 日志切面类的方法需要动态感知方法的运行状态
 * 	通知：
 * 		前置通知：logStart();在目标方法之前运行(@Before)
 * 		后置通知：logEnd();在目标方法运行结束之后，不管有没有异常(@After)
 * 		返回通知：logReturn();在目标方法正常返回后运行(@AfterReturning)
 * 		异常通知：logException();目标方法出现异常后运行(@AfterThrowing)
 * 		环绕通知：动态代理，需要手动执行joinPoint.procced(),才会执行目标方法,执行之前相当于前置通知，执行之后相当于后置通知(@Around)
 */
@Configuration
@EnableAspectJAutoProxy
public class Cap10MainConfig {

	@Bean
	public Calculator calculator(){
		return new Calculator();
	}
	
	@Bean
	public LogAspects logAspect(){
		return new LogAspects();
	}
}
