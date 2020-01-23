package com.apex.user.client;

import com.apex.user.dao.UserDao;
import com.apex.user.entity.User;

public class UserClient {
	
	public static void main(String[] args) {
		User user = new User();
		user.setFirstName("KAshfia");
		user.setLastName("Rahman");
		user.setMiddleName("Sharif");
		UserDao userdao = new UserDao();
		userdao.addUser(user);
	}

}
