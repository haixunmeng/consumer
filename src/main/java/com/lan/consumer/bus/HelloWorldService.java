package com.lan.consumer.bus;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "provider")
public interface HelloWorldService {

	@GetMapping("/hello")
	public Map<String, String> hello();
	
}
