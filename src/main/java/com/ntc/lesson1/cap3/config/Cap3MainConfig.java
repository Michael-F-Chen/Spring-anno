package com.ntc.lesson1.cap3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ntc.lesson1.cap1.Person;

@Configuration
public class Cap3MainConfig {
	/*
	 * prototype: ��ʵ����IOC��������������ȥ���÷�������������������У�����ÿ�λ�ȡ��ʱ��Ż���÷�����������,��test02
	 * singleton: ��ʵ����Ĭ�ϣ���IOC������������÷�����������ŵ�IOC�����У��Ժ�ÿ����ȡ����ֱ�Ӵ����������ɴ�map.get�������� 
	 * request:  ��Ҫ���WEBӦ�ã�ͬһ�����󴴽�һ��ʵ��
	 * session:  ͬһ��session����һ��ʵ�������������õò��࣬�˽⼴�ɣ�
	 */
	
	// ��ʵ��
	@Scope("prototype")
//	@Lazy
	@Bean
	public Person person() {
		return new Person("ntc1",27);
	}
}
 