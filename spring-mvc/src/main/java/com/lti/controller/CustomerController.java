package com.lti.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.lti.model.Customer;
import com.lti.service.CustomerService;


@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;		//if there were interface autowired that
	//what we want is, when the form is submitted, the date should automatically get stored
	// in some object for us
	
	@RequestMapping(path="/addCustomer.lti" , method = RequestMethod.POST)
	public String add(Customer customer, @RequestParam("profilePic") MultipartFile profilePic) {
		String path="d:/uploads/";
		String finalpath = path + profilePic.getOriginalFilename();
		
		try {
			profilePic.transferTo(new File(finalpath));
		}catch(Exception e) {
			e.printStackTrace();     //inform user for failure
		}
		
		
		customer.setProfilePicFileName(profilePic.getOriginalFilename());
		customerService.add(customer);
		return "success.jsp";
	}
	
	
}
