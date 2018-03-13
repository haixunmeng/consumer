package com.lan.consumer.bus;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldConsumer {
	
	@Autowired
	private HelloWorldService helloWorldService;

	@GetMapping("/hello/world")
	public Map<String, String> hello(){
		return helloWorldService.hello();
	}

}
