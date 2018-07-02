package com.ntc.lesson8.cap11.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntc.lesson8.cap11.dao.OrderDao;

@Service
public class OrderService {

	@Autowired
	private OrderDao orderDao;
	
	public void addOrder(){
		orderDao.insert();
		System.out.println("操作完成");
	}
}
