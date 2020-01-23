package com.apex.user.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apex.user.dao.UserDAO;
import com.apex.user.vo.User;

@Service
public class UserBOImpl implements UserBO {
	@Autowired
	UserDAO userDAO = null;
	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("UserBOImpl: addUser -  start");
		//UserDAO userDAO = new UserDAOImpl();
		userDAO.addUser(user);
		System.out.println("UserBOImpl: addUser -  end");
		
		
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
