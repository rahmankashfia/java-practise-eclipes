package com.apex.user.service;

import com.apex.user.dao.UserDao;
import com.apex.user.vo.User;

public class UserService {
	public User getUser(int id){
		System.out.println("User Service - Start");
		UserDao userDao = new UserDao();
		User user = userDao.getUser(id);
		System.out.println("User Dao - End");
		return user;
		
	}

}
