package com.ntc.lesson2.cap6.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;


public class Cap6ImportSelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		// TODO Auto-generated method stub
		
		// 不能return默认的null，运行的时候会报错。用 new String[]{}代替
		return new String[] {
				"com.ntc.lesson2.cap6.bean.Fish",
				"com.ntc.lesson2.cap6.bean.Tiger"
		};
	}	
}
