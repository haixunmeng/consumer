package com.lan.consumer.bus;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginService;

	@GetMapping("/login")
	public Map<String, String> hello(){
		LoginInputBean input = new LoginInputBean();
		
		input.setUsername("lanlan");
		input.setPassword("123456");
		
		return loginService.login(input);
	}

}
