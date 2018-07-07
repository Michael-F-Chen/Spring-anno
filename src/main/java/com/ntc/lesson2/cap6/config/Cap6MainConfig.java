package com.ntc.lesson2.cap6.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.ntc.lesson1.cap1.Person;
import com.ntc.lesson2.cap6.bean.Cat;
import com.ntc.lesson2.cap6.bean.Dog;

@Configuration
//@Import(Dog.class) 导入单个组件
//@Import(value= {Dog.class, Cat.class} 导入多个组件
//导入组件，ID默认是组件全类名

//使用自定义选择器
@Import(value= {Dog.class, Cat.class, Cap6ImportSelector.class, Cap6ImportBeanDefinitionRegistrar.class})
public class Cap6MainConfig {

	// 容器启动时初始化person的bean实例
	@Bean("person")
	public Person person() {
		System.out.println("给容器中添加person....");
		return new Person("person",27);
	}
		
	/*  
	 *  给容器中注册组件的方式
	 * 1，包扫描+组件的标注注解（@CompoentScan,@Controller,@Service,@Reponsitory,@Componet）,一般是对自己写的类使用
	 * 2，@Bean：[导入第三方类或包的组件，比如Person为第三方类，需要IOC容器中使用] 
	 * 3，@Import：[快速给容器导入一个组件] 注意：@Bean有点简单，构造一个无参或有参的bean
	 *		a,@Import(要导入到容器中的组件)：容器会自动注册这个组件，bean的id为全类名
	 *		b,ImportSelector:是一个接口，返回需要导入容器的全类名数组（注意，默认的return null会引起bug，可以改为return new String[]{}）。
	 *		c,ImportBeanDefinitionRegistrar:可以手动添加组件到IOC容器，所以Bean的注册可以使用BeanDifinitionRegistrar
	 *			写Cap6ImportBeanDefinitionRegistrar实现ImportBeanDefinitionRegistrar接口即可。
	 * 4，使用Spring提供的FactoryBean（工厂bean）进行注册
	 * 	beans.factory.FatoryBean源码中
	 * 		容器调用getObject()返回对象，把对象放到容器中；
	 * 		getObjectType()返回对象类型
	 * 		isSingleton()是否是单实例
	 * 		新建NtcFactoryBean实现FactoryBean
	 * 		在config里新建ntcFactoryBean()方法
	 * 		在测试用例中
	 * 			a，默认获取到的是工厂bean调用getObject创建的对象
	 * 			b，要获取工厂Bean本省，需要在id前加个 "&" ->  "&ntcFactoryBean"		
	 */
	
	@Bean
	public NtcFactoryBean ntcFactoryBean() {
		return new NtcFactoryBean();
	}
	
}
