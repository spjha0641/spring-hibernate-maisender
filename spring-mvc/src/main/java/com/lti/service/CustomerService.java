package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.CustomerDao;
import com.lti.model.Customer;

//@Component
@Service
public class CustomerService {
	
	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private SendMailService sendMailService;
	
	
	public void add(Customer customer) {
		customerDao.add(customer);
		sendMailService.send(customer.getEmail() , "Thank you", "Thank you for registering");
	}

}
