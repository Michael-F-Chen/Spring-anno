package com.ntc.lesson4.cap9;


import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ntc.lesson4.cap9.bean.Moon;
import com.ntc.lesson4.cap9.bean.Sun;
import com.ntc.lesson4.cap9.config.Cap9MainConfig;
import com.ntc.lesson4.cap9.dao.TestDao;
import com.ntc.lesson4.cap9.service.TestService;

public class Cap9Test {

	@Test
	public void test01() {
 		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap9MainConfig.class);
		
 		TestService service = app.getBean(TestService.class);
 		service.println();
 		
 		// 直接从容器中获取TestDao,和使用Autowired注解比较，是一样的
 		TestDao dao = app.getBean(TestDao.class);
 		System.out.println(dao);

 		Moon moon = (Moon)app.getBean(Moon.class);
 		System.out.println("moon ======> " + moon);
 		
 		Sun sun = (Sun)app.getBean(Sun.class); 		
 		System.out.println("sun.getMoon() ======> " + sun.getMoon());
 		
		app.close();
	}
}
