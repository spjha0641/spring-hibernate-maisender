package com.lti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
	
@Controller
public class HelloController {		//controller
	
	@RequestMapping("/hello.lti")	
	public String hello(ModelMap model) {				//model
		model.put("message", "Welcome to Spring MVC");
		return "hello.jsp";						//view
	}
	
	
}
