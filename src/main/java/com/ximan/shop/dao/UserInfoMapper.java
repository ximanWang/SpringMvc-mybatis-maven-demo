package com.ximan.shop.dao;

import java.util.List;

import com.ximan.shop.model.UserInfo;

public interface UserInfoMapper {
	List<UserInfo> selectAll();
	
	int insert(UserInfo record);
	
	int insertSelective(UserInfo record);
	
	UserInfo selectById(Integer id);
	
	int deleteById(Integer id);
	
	int updateUserInfo(UserInfo record);
	
	int updateByPrimaryKeySelective(UserInfo record);
}
