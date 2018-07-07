package com.ntc.lesson2.cap6.config;

import org.springframework.beans.factory.FactoryBean;

import com.ntc.lesson2.cap6.bean.Monkey;

/*
 * 实现FactoryBean<T>接口将Monkey.Class注入到容器中
 */
// 创建一个Spring定义的工厂bean
public class NtcFactoryBean implements FactoryBean<Monkey>{
	// 返回一个Monkey对象，这个对象会添加到容器中
	@Override
	public Monkey getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Monkey();
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Monkey.class;
	}
	
	// 是否为单例
	// 怎么创建，就是调用getObject()方法创建
	// 此方法在接口中被默认实现，可以手动重写
	@Override
	public boolean isSingleton() {
		return true;
	}

}
