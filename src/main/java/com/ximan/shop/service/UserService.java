package com.ximan.shop.service;

import java.util.List;

import com.ximan.shop.model.UserInfo;

public interface UserService {

	UserInfo getUserById(int id);
	
	List<UserInfo> getUsers();
	
	int insert(UserInfo userInfo);
}
