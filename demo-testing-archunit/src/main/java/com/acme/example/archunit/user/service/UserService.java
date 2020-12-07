package com.acme.example.archunit.user.service;

import com.acme.example.archunit.user.entity.User;

public interface UserService {
	
	User findUser(Long id);
	
}
