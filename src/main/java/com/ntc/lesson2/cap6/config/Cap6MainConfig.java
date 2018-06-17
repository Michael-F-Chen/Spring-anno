package com.ntc.lesson2.cap6.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.ntc.lesson1.cap1.Person;
import com.ntc.lesson2.cap6.bean.Cat;
import com.ntc.lesson2.cap6.bean.Dog;

@Configuration
@Import(value= {Dog.class, Cat.class, Cap6ImportSelector.class, Cap6ImportBeanDefinitionRegistrar.class})
public class Cap6MainConfig {

	/*  
	 *  给容器中注册组件的方式
	 *1，@Bean：[导入第三方类或包的组件]，比如Person为第三方类，需要IOC容器中使用
	 *2，包扫描+组件的标注注解（@CompoentScan,@Controller,@Service,@Reponsitory,@Componet）,一般是对自己写的类使用
	 *3，@Import：[快速给容器导入一个组件] 注意：@Bean有点简单
	 *		a,@Import(要导入到容器中的组件)：容器会自动注册这个组件，bean的id为全类名
	 *		b,ImportSelector:是一个接口，返回需要导入容器的全类名数组。
	 *		c,ImportBeanDefinitionRegistrar:可以手动添加组件到IOC容器，所以Bean的注册可以使用BeanDifinitionRegistrar
	 *			写Cap6ImportBeanDefinitionRegistrar实现ImportBeanDefinitionRegistrar接口即可。
	 *4，使用Spring提供的FactoryBean（工厂bean）进行注册
	 */
	
	// 容器启动时初始化person的bean实例
	@Bean("person")
	public Person person() {
		System.out.println("给容器中添加person....");
		return new Person("person",27);
	}
	
	@Bean
	public NtcFactoryBean ntcFactoryBean() {
		return new NtcFactoryBean();
	}
	
}
