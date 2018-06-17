package com.ntc.lesson3.cap7.bean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@SuppressWarnings("restriction")
@Component
public class Jeep {
	public Jeep() {
		System.out.println("Jeep.... constructor........");
	}
	
	@PostConstruct
	private void init() {
		System.out.println("Jeep .....  @PostConstruct......");
	}
	@PreDestroy
	private void destroy() {
		System.out.println("Jeep .....  @PreDestroy......");
	}
}
