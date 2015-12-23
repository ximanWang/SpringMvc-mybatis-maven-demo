package com.ximan.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ximan.shop.dao.UserInfoMapper;
import com.ximan.shop.model.UserInfo;
import com.ximan.shop.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
		
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	@Override
	public UserInfo getUserById(int id) {
		return userInfoMapper.selectById(id);
	}

	@Override
	public List<UserInfo> getUsers() {
		return userInfoMapper.selectAll();
	}

	@Override
	public int insert(UserInfo userInfo) {
		
		int result = userInfoMapper.insert(userInfo);
		
		System.out.println(result);
		return result;
	}
	
}
