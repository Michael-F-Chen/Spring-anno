package com.ntc.lesson3.cap7.bean;

public class Bike {
	public Bike() {
		System.out.println("Bike constructor........");
	}
	private void init() {
		System.out.println("Bike .....  init......");
	}
	private void destroy() {
		System.out.println("Bike .....  destroy......");
	}
}
