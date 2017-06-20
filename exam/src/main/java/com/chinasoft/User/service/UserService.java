package com.chinasoft.User.service;

import com.chinasoft.User.pojo.User;

public interface UserService {

	public void register(User user) throws UserException;

}
