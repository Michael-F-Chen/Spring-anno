package com.ntc.lesson4.cap9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ntc.lesson4.cap9.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	private TestService testSrv;
}
