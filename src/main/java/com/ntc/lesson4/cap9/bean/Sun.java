package com.ntc.lesson4.cap9.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// 默认加载IOC容器中的组件，容器启动会调用我参构造器创建对象，再进行初始化赋值操作
@Component
public class Sun {
	
	private Moon moon;
	
//	public Sun(@Autowired Moon moon){ // 可以放在有参构造函数的参数上
//		this.moon = moon;
//		System.out.println("Sun(Moon moon) ========> " + moon);
//	}
	
	@Autowired // 对于有参构造器，加不加@Autowired效果一样
	public Sun(Moon moon){
		this.moon = moon;
		System.out.println("Sun(Moon moon) ========> " + moon);
	}
	
	public Moon getMoon() {		
		return moon;
	}

	// 可以放在任何方法上
	// 当标注在方法上：spring容器创建当前对象时，就会调用方法，完成赋值
	// 方法使用的参数，自定义类型的值从IOC容器中获取，方法里的moon会从容器中拿到
	@Autowired
	public void setMoon(Moon moon) {// 此方法的moon从容器中拿到
		this.moon = moon;
	}

	@Override
	public String toString() {
		return "Sun [moon=" + moon + "]";
	}	
	
}
