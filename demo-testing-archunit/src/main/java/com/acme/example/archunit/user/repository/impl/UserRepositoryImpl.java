package com.acme.example.archunit.user.repository.impl;

import com.acme.example.archunit.user.entity.User;
import com.acme.example.archunit.user.factory.UserDataFactory;
import com.acme.example.archunit.user.repository.UserRepository;

public class UserRepositoryImpl implements UserRepository {
	
	public User findByPK(Long userId) {
		return UserDataFactory.createSampleUserDefault();
	}

}
