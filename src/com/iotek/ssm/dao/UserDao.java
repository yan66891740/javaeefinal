package com.iotek.ssm.dao;

import com.iotek.ssm.entity.User;

public interface UserDao {
	
	public int addUser(User user);
	
	public int delUser(int id);
	
	public int updateUser(User user);
	
	public User queryByUsername(String username);

}
