package com.facebookmicroservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

	@GetMapping("displayAllEmployee")
	public List<String> allEmployee(){
		List<String> ll= Arrays.asList("Rachel","Aron","Gibb","Rajesh");
		return ll;
	}
}
