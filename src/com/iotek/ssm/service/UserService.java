package com.iotek.ssm.service;

import com.iotek.ssm.entity.User;

public interface UserService {

	User queryUserByUsername(String username);
	
	

}
