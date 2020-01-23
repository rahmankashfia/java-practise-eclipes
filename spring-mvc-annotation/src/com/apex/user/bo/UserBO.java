package com.apex.user.bo;

import com.apex.user.vo.User;

public interface UserBO {
	
	public User getUser(int id);
	public void addUser(User user);
	public void deleteUser(int id);
	public void updateUser(int id);

}
