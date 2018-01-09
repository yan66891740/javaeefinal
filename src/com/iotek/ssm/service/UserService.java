package com.iotek.ssm.service;

import com.iotek.ssm.entity.User;

public interface UserService {

	public User queryUserByUsername(String username);
	
	public int addUser(User user);

	public int update(User user);

}
