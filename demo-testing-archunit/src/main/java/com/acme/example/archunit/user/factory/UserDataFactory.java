package com.acme.example.archunit.user.factory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.acme.example.archunit.constant.UserConstant;
import com.acme.example.archunit.user.entity.User;

public final class UserDataFactory {

	public static User createSampleUserWithId(Long id,String name,String rol, boolean enabled) {
		final User user = new User();
		user.setId(id);
		user.setName(name);
		user.setRol(rol);
		user.setEnabled(enabled);
		return user;
	}
	
	public static User createSampleUserDefault() {
		return createSampleUserWithId(UserConstant.TEST_ID,UserConstant.TEST_USERNAME,UserConstant.TEST_ROL,UserConstant.TEST_ENABLED);
	}
	
	public static Map<Long,User> createSampleUserMap() {
		final Map<Long,User> map = new HashMap<>(); 
		map.put(UserConstant.TEST_USER_1_ID, UserDataFactory.createSampleUserWithId(UserConstant.TEST_USER_1_ID,UserConstant.TEST_USER_1_USERNAME , UserConstant.TEST_USER_1_ROL,UserConstant.TEST_USER_1_ENABLED));
		map.put(UserConstant.TEST_USER_2_ID, UserDataFactory.createSampleUserWithId(UserConstant.TEST_USER_2_ID,UserConstant.TEST_USER_2_USERNAME , UserConstant.TEST_USER_2_ROL,UserConstant.TEST_USER_2_ENABLED));
		return map;
	}
	
	public static List<User> createSampleUserList() {
		final List<User> list = new ArrayList<>();
		list.add(UserDataFactory.createSampleUserWithId(UserConstant.TEST_USER_1_ID,UserConstant.TEST_USER_1_USERNAME ,UserConstant.TEST_USER_1_ROL,UserConstant.TEST_USER_1_ENABLED));
		list.add(UserDataFactory.createSampleUserWithId(UserConstant.TEST_USER_2_ID,UserConstant.TEST_USER_2_USERNAME ,UserConstant.TEST_USER_2_ROL,UserConstant.TEST_USER_2_ENABLED));
		return list;
	}
	
}
