package com.chinasoft.User.mapper;

import com.chinasoft.User.pojo.User;

public interface UserMapper {

	public User findUserByName(String username);
	public void addUser(User user);
}
