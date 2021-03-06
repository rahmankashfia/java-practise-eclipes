package com.spring.controller;

import com.spring.dao.LoginDAO;
import com.spring.model.LoginModel;
import com.spring.service.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("login.htm")
public class LoginController {

	@Autowired
	LoginDAO loginDAO;

	@RequestMapping(method = RequestMethod.GET)
	public String init(ModelMap modelMap) {
		modelMap.put("info", "Hello User");
		return "Login";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submit(ModelMap modelMap, @ModelAttribute("loginModel") @Validated LoginModel loginModel) {
		String password = loginModel.getPassword();
		String userName = loginModel.getUserName();
		if (password != null && userName != null) {
			Login userDetails = loginDAO.getUserDetails(loginModel.getUserName());
			if (userDetails != null && userDetails.getUserName().trim().equals(userName)
					&& userDetails.getPassword().trim().equals(password)) {
				modelMap.put("userDetails", userDetails);
				return "Home";
			} else {
				modelMap.put("error", "Invalid UserName / Password");
				return "Login";
			}
		} else {
			modelMap.put("error", "Invalid UserName / Password");
			return "Login";
		}
	}
}