package com.acme.example.archunit.user.service.impl;

import javax.annotation.PostConstruct;

import com.acme.example.archunit.user.entity.User;
import com.acme.example.archunit.user.repository.UserRepository;
import com.acme.example.archunit.user.repository.impl.UserRepositoryImpl;
import com.acme.example.archunit.user.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;

	@PostConstruct
	private void init() {
		userRepository = new UserRepositoryImpl();
	}
	
	@Override
	public User findUser(Long id) {
		
		return userRepository.findByPK(id);
	}

	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	

}
