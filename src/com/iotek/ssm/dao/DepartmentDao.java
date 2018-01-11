package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Department;

public interface DepartmentDao {
	
	public int addDept(Department dept);
	
	public int delDept(int id);
	
	public int updateDept(String name);
	
	public Department queryById(int id);
	
	public List<Department> queryAllDept();

	public Department queryByName(String name);

}
