package com.financialservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class UserController {
	@Autowired
	 private UserRepository userrepo;
	
 
	
	@PostMapping("/registerUser")
	 UserEntity register(@RequestBody UserEntity user)
	{
		System.out.println("The registration is done");
		
		return userrepo.save(user);
		
	}

}
