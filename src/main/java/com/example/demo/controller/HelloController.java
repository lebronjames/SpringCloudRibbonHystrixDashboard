package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.HelloService;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@Autowired
	HelloService helloService;
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String add() {
		return helloService.hello();
	}
}
