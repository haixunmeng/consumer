package com.lan.consumer.bus;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "login", configuration=LoginFeignConfiguration.class)
public interface LoginService {

	@PostMapping("/login")
	public Map<String, String> login(@RequestBody LoginInputBean input);
	
}
