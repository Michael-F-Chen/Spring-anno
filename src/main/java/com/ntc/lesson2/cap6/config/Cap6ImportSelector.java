package com.ntc.lesson2.cap6.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/*
 * 自定义导入bean选择器
 * 自定义逻辑返回需要导入的组件
 */
public class Cap6ImportSelector implements ImportSelector {
	//返回值，就是导入到容器中的组件全类名
	
	/*
	 * AnnotationMetadata:当前标注@Import注解类的所有注解信息，
	 * 不知能获取到import注解，还能获取到其他注解
	 */
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		// TODO Auto-generated method stub
	
		// 方法不要返回return默认的null，运行的时候会报错。用 new String[]{}代替
		// 新增 Fish 和 Tiger
		return new String[] {
				"com.ntc.lesson2.cap6.bean.Fish",
				"com.ntc.lesson2.cap6.bean.Tiger"
		};
	}	
}
