package com.apex.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apex.user.bo.UserBO;
import com.apex.user.vo.*;

 
@Controller  
public class UserController {
	UserBO UserBO = null;
	@RequestMapping("/entryadduser") 
	public String addUserEntry(@ModelAttribute User user)  {
		System.out.println("java");
		return "person";  
		
	}
	
	
	@RequestMapping("/processadduser") 
	public String addUser(@ModelAttribute User user)  {  
		
		System.out.println("First Name: " + user.getFirstName());
		return "success"; 
	      
	}  
}
