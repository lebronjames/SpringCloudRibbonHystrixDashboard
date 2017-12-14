package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.service.ComputeService;

@RestController
@RequestMapping("/compute")
public class ConsumerController {

	@Autowired
	ComputeService computeService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String add() {
		return computeService.add();
	}
}
