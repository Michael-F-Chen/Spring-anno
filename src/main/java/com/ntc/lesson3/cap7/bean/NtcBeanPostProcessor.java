package com.ntc.lesson3.cap7.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
@Component
public class NtcBeanPostProcessor implements BeanPostProcessor{
	
	/*
	 *  返回一个对象（传过来的对象）
	 * 在初始化方法调用之前进行后置处理工作
	 * 调用时机：init-method=init之前调用 
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("NtcBeanPostProcessor postProcessBeforeInitialization........ " + bean.toString());
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("NtcBeanPostProcessor postProcessAfterInitialization........ " + bean.toString());
		return bean;
	}
}
