package com.ntc.lesson2.cap6.config;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import com.ntc.lesson2.cap6.bean.Pig;

/*
 * 手动注册bean
 */
public class Cap6ImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	/*
	 * AnnotationMetadata:当前类的注解信息
	 * BeanDefinitionRegistry:Beandefinition注册类
	 * 		把所有需要添加到容器中的bean加入;
	 * 		调用BeanDefinitionRegistry.registerBeanDefinition自定义手动注册进来
	 */
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		// TODO Auto-generated method stub
		boolean bean1 = registry.containsBeanDefinition("com.ntc.lesson2.cap6.bean.Dog");
		boolean bean2 = registry.containsBeanDefinition("com.ntc.lesson2.cap6.bean.Cat");
		
		// 如果Dog和Cat同时存在的于IOC容器中，那么创建Pig类，加入到容器
		if(bean1 && bean2) {
			// 以前的bean都是全类名，现在自定义bean名
			// registerBeanDefinition,第二个参数beanDefinition指的是Bean的定义信息（Bean的类型，bean的scope）
			RootBeanDefinition beanDefinition = new RootBeanDefinition(Pig.class);
			registry.registerBeanDefinition("pig", beanDefinition);
		}
		
	}	
}
