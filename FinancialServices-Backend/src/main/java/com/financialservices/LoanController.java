package com.financialservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
	
	@Autowired
	LoanRepository loanrepo;
	
	@RequestMapping(value="/availableloans",method=RequestMethod.GET)
	public List<LoanEntity> loanDetails()
	{
	   System.out.println("The loan details are as follows");
	   
		return loanrepo.findAll();
		
		
	}
	
	

}
