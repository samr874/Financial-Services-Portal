package com.financialservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
	
	@Autowired
	LoanRepository loanrepo;
	
	@GetMapping("/loandetails")
	List<LoanEntity> loanDetails()
	{
	 
		
		return loanrepo.findAll();
		
	}

}
