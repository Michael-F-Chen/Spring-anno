package com.ntc.lesson4.cap9.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntc.lesson4.cap9.dao.TestDao;

@Service
public class TestService {

	@Autowired
	private TestDao testDao;
	
	public void println(){
		System.out.println(testDao);
	}
}
