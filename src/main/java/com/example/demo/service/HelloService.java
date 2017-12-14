package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {

	@Autowired
	RestTemplate restTemplate;
	
	//增加@HystrixCommand注解来指定回调方法
	@HystrixCommand(fallbackMethod="addServiceFallback")
	public String hello() {
		return restTemplate.getForEntity("http://compute-serviceA/add?a=15&b=27", String.class)
				.getBody();
	}
	
	public String addServiceFallback() {
		return "ERROR";
	}
}
