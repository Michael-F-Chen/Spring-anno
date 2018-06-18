package com.ntc.lesson4.cap8.bean;

import org.springframework.beans.factory.annotation.Value;

public class Bird {
	
	/*
	 * 使用@Value进行赋值
	 * 1:基本字符
	 * 2:SpringEL表达式
	 * 3:读取配置文件
	 */
	@Value("Ntc")
	private String name;
	
	@Value("#{20-2}")
	private Integer age;
	
	// 从配置文件中获取对应的值，配置文件在配置类中导入
	@Value("${bird.color}")
	private String color;
	
	public Bird() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bird(String name, Integer age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Bird [name=" + name + ", age=" + age + ", color=" + color + "]";
	}	
	
}
