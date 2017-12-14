package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.WorldService;

@RestController
@RequestMapping("/world")
public class WorldController {

	@Autowired
	WorldService worldService;
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String test() {
		return worldService.world();
	}
}
