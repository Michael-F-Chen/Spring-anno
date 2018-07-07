package com.ntc.lesson2.cap5.config;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/*
 * 条件注册bean
 */
public class WinCondition implements Condition {
	
	/*
	 *ConditionContext:判断条件可以使用的上下文（环境）
	 *AnnotatedTypeMetadata:注解的信息
	 */
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// TODO 是否为WINDOW系统
		// 1.能够取到IOC容器正在使用的beanFactory
		ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
		// 2.获取类加载器
		ClassLoader classLoader = context.getClassLoader();
		// 3.获取当前环境变量（包括操作系统是WIN还是LINUX）
		Environment environment = context.getEnvironment();
		// 4.获取bean定义的注册类
		BeanDefinitionRegistry registry = context.getRegistry();
		String os_name = environment.getProperty("os.name");
		if(os_name.contains("Windows")) {
			return true;
		}
		return false;
	}
}
