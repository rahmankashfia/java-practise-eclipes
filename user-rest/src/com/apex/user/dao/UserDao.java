package com.apex.user.dao;

import com.apex.user.vo.User;

public class UserDao {
	
	public User getUser(int id){
		System.out.println("User Dao - Start");
		User user = new User();
		user.setId(1);
		user.setFirstName("Kashfia");
		user.setMiddleName("Rahman");
		user.setLastName("Sharif");
		System.out.println("User Dao - End");
		return user;
		
	}

}
