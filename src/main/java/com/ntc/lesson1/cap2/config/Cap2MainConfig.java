package com.ntc.lesson1.cap2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
/**
 *   使用@ComponentScan扫描指定路径下的组件
 *  使用includeFilters 过滤bean
 */
@Configuration
@ComponentScan(value="com.ntc.lesson1.cap2", includeFilters= {
			// 按指定注解过滤
//			@Filter(type=FilterType.ANNOTATION, classes=(Controller.class))
			// 按指定类型过滤
//			@Filter(type=FilterType.ASSIGNABLE_TYPE, classes=(OrderController.class))
			// 自定义过滤 NtcTypeFilter实现TypeFilter
			@Filter(type=FilterType.CUSTOM, classes=(NtcTypeFilter.class))
},
// useDefaultFilters=true 会默认扫描所有@Component注解
useDefaultFilters=false)  

// 扫描多组件
//@ComponentScans(value= {
//		@ComponentScan(value="com.ntc.lesson1.cap2", includeFilters= {
//				@Filter(type=FilterType.CUSTOM, classes=(NtcTypeFilter.class))
//			}, useDefaultFilters=false),
//		@ComponentScan(value="com.ntc.lesson1.cap2", includeFilters= {
//				@Filter(type=FilterType.ANNOTATION, classes=(Controller.class))
//			}, useDefaultFilters=false),
//		})  

public class Cap2MainConfig {

}
 