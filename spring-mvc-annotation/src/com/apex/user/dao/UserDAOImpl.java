package com.apex.user.dao;

import org.springframework.stereotype.Repository;

import com.apex.user.vo.User;

@Repository
public class UserDAOImpl implements UserDAO {
	UserDAO userDAO = null;

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("UserDAOImpl: addUser -  start");
		
		System.out.println("UserDAOImpl: addUser -  end");
		return;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		return;
	}

	@Override
	public void updateUser(int id) {
		// TODO Auto-generated method stub
		return;
	}

}
