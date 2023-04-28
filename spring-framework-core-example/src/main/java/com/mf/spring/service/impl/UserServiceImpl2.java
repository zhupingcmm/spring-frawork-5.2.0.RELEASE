package com.mf.spring.service.impl;

import com.mf.spring.pojo.User;
import com.mf.spring.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl2 implements UserService {
	@Override
	public User getUserById(long id) {
		return new User("cmm");
	}
}
