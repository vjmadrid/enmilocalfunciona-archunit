package com.acme.example.archunit.user.controller;

import javax.annotation.PostConstruct;

import com.acme.example.archunit.user.entity.User;
import com.acme.example.archunit.user.service.UserService;
import com.acme.example.archunit.user.service.impl.UserServiceImpl;

public class UserController {
	
	private UserService userService;

	@PostConstruct
	private void init() {
		userService = new UserServiceImpl();
	}
	
	public User findUser(Long id) {
		
		return userService.findUser(id);
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	

}
