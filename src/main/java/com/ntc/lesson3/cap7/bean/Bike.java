package com.ntc.lesson3.cap7.bean;

public class Bike {
	// 先执行构造方法
	public Bike() {
		System.out.println("Bike constructor........");
	}
	
	// 再执行初始化方法
	private void init() {
		System.out.println("Bike .....  init......");
	}
	
	// 最后执行销毁方法
	private void destroy() {
		System.out.println("Bike .....  destroy......");
	}
}
