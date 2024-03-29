package com.apex.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apex.user.bo.UserBO;
import com.apex.user.vo.*;

 
@Controller  
public class UserController {
	@Autowired
	UserBO userBO = null;
	@RequestMapping("/entryadduser") 
	public String addUserEntry(@ModelAttribute User user)  {
		System.out.println("java");
		return "person";  
		
	}
	
	
	@RequestMapping("/processadduser") 
	public String addUser(@ModelAttribute User user)  {  
		
		System.out.println("First Name: " + user.getFirstName());
		System.out.println("UserController: addUser -  start");
		//UserBO userBO = new UserBOImpl();
		userBO.addUser(user);
		System.out.println("UserController: addUser -  end");
		return "success"; 
	      
	}  
}
