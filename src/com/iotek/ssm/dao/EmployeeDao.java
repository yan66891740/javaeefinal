package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Employee;

public interface EmployeeDao {
	
	public int addEmp(Employee emp);
	
	public int delEmp(int id);
	
	public int updateEmp(Employee emp);
	
	public Employee queryById(int id);
	
	public List<Employee> queryByDeptId();
	
	public List<Employee> queryByPostId();

}
