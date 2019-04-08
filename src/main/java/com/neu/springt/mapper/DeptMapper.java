package com.neu.springt.mapper;

import com.neu.springt.pojo.Dept;

public interface DeptMapper {
	public void deleteDept(int dno);
	public void insertDept(Dept dept);
	public Dept queryDept(Integer dno);
}
