package com.ntc.lesson4.cap9.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sun {
	
	private Moon moon;
	
	@Autowired
	public Sun(Moon moon){
		this.moon = moon;
		System.out.println("Sun(Moon moon) ========> " + moon);
	}
	public Moon getMoon() {		
		return moon;
	}

	@Autowired
	public void setMoon(Moon moon) {
		this.moon = moon;
	}

	@Override
	public String toString() {
		return "Sun [moon=" + moon + "]";
	}	
	
}
