package com.ntc.lesson4.cap9.service;


import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ntc.lesson4.cap9.dao.TestDao;

@Service
public class TestService {

	/*
	 * @Autowired 和  @Bean 同时存在时,
	 * 注册bean是有优先级的，
	 * 优先@Autowired，获取默认的类，
	 * 并且不再执行@Bean，
	 * 如果要执行指定的@Bean，需在@Autowired上使用@Qualifier指明bean的name
	 */
//	@Qualifier("testDao")
//	@Autowired(required = false)
	
	/*
	 * 效果是一样的，与Autowired效果一样可以装备bean（可以指定名称，也可以不指定名称）
	 * 1.不支持@Primary功能(不支持优先级)
	 * 2.不支持@Autowired(required = false)(当bean不存在时，Resource会报错)
	 * 建议使用@Autowired
	 */
//	@Resource(name="testDao")
	
	/*
	 * 需要pom.xml额外引用javax.inject，
	 * 和@Autowired功能差不多，
	 * 支持@Primary，
	 * 当bean不存在时，也不会报错，
	 * 只是没有Autowired(required = false)功能	
	 * 有些项目不是基于spring，可以使用@Inject(第三方，不依赖spring)
	 */
	@Inject
	private TestDao testDao;
	
	public void println(){
		System.out.println(testDao);
	}
}
