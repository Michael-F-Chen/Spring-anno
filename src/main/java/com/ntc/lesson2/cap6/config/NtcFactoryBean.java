package com.ntc.lesson2.cap6.config;

import org.springframework.beans.factory.FactoryBean;

import com.ntc.lesson2.cap6.bean.Monkey;

public class NtcFactoryBean implements FactoryBean<Monkey>{

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
	
	// 此方法在接口中被默认实现，可以手动重写
	@Override
	public boolean isSingleton() {
		return true;
	}

}
