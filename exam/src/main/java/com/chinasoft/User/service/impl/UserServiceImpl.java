package com.chinasoft.User.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.chinasoft.User.mapper.UserMapper;
import com.chinasoft.User.pojo.User;
import com.chinasoft.User.service.UserException;
import com.chinasoft.User.service.UserService;
import com.chinasoft.User.utils.MailUtils;

public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;

	public void register(User user) throws UserException {
		User form = userMapper.findUserByName(user.getUsername());
		if(form!=null){
			throw new UserException("用户已存在");
		}else{
			userMapper.addUser(user);
		}
		
	}




}
