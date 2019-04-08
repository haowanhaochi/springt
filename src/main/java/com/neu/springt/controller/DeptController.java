package com.neu.springt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neu.springt.pojo.Dept;
import com.neu.springt.service.DeptService;

@Controller
public class DeptController {
	@Autowired
	private DeptService service;

	@RequestMapping("/test")
	public String testController()
	{
		System.out.println("点了呀");
		return "ret.jsp";
	}
	@RequestMapping("/insert")
	public String insertController(Dept dept)
	{
		System.out.println("controller -- " + dept.getDname());
		service.insert(dept);
		return "ret.jsp";
	}
	
	@RequestMapping("/query")
	public ModelAndView queryController(Integer dno)
	{
		ModelAndView mav = new ModelAndView("index.jsp");
		Dept dept = service.query(dno);
		mav.addObject("dno", dept.getDno());
		mav.addObject("dname", dept.getDname());
		mav.addObject("dloc", dept.getDloc());
		return mav;
	}
}
