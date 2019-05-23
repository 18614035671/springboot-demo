package org.service;

import org.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;

	public User getUserById(Long id){
		return userMapper.getUserById(id);
	}
}
