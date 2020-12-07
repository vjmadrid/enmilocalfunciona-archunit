package com.acme.example.archunit.user.repository;

import com.acme.example.archunit.user.entity.User;

public interface UserRepository {

	public User findByPK(Long userId);
	
}