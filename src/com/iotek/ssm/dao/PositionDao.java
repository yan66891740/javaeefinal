package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Position;

public interface PositionDao {
	
	public int addPost(Position post);
	
	public int delPost(int id);
	
	public int updatePost(String name);
	
	public Position queryById(int id);
	
	public List<Position> queryByDeptId(int id);

}
