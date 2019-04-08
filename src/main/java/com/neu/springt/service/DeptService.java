package com.neu.springt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neu.springt.mapper.DeptMapper;
import com.neu.springt.pojo.Dept;

@Service
public class DeptService {
	@Autowired
	private DeptMapper mapper;
	public void delete(int dno)
	{
		mapper.deleteDept(dno);
		System.out.println("Service delete -- " + dno);
	}
	public void insert(Dept dept)
	{
		System.out.println("aaaaaaaaaaaaaa");
		mapper.insertDept(dept);
	}
	public Dept query(Integer dno)
	{
		return mapper.queryDept(dno);
	}
}
