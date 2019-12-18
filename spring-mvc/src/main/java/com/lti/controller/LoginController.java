package com.lti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping("/login.lti")	
	public String login(@RequestParam("username") String username, @RequestParam("password") String password, ModelMap model) {
		if(username.equals("satya") && password.equals("rishu"))
			return "success.jsp";
		else {
			model.put("errorMsg", "error ocurred.. wrong credentials");
			return "login.jsp";
		}
		
	}
	

}
