package com.ntc.lesson5.cap10.aop;

public class Calculator {

	// 业务逻辑方法
	public int div(int i, int j){
		System.out.println("-------- div方法开始执行-------");
		return i/j;
	}
}
