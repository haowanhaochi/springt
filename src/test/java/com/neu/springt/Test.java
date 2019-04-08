package com.neu.springt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neu.springt.service.DeptService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		DeptService service = ac.getBean(DeptService.class);
		service.delete(1);
	}

}
