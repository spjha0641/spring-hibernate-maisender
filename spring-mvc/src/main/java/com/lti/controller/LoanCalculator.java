package com.lti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoanCalculator {
	
	@RequestMapping("/calculate.lti")
	public String calc(@RequestParam("loanAmount") int loanAmount, @RequestParam("tenure") int tenure, ModelMap model) {
		int emi = loanAmount / (tenure * 12);
		model.put("emi", emi);
		return "calculator.jsp";
	}
}
