package com.crm.home.account.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping("/" )
	public String index() {
		System.out.println(" ################################################# ");
		return "Greetings from Spring Boot!"; 
	}

}
