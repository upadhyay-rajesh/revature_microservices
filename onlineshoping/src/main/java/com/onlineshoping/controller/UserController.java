package com.onlineshoping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshoping.entity.AmazonUser;
import com.onlineshoping.service.AmazonUserServiceInterface;


@RestController
public class UserController {
	
	@Autowired 
	private AmazonUserServiceInterface serviceInterface;
	
	
	
	@GetMapping("login/{id}/{password}")
	public String loginUser(@PathVariable("id") String id,@PathVariable("password") String password) {
		AmazonUser auser=new AmazonUser();
		auser.setId(id);
		auser.setPassword(password);
		
		String result=serviceInterface.loginUser(auser);
		
		int otp=0;
		
		if(result!=null) {
			otp=(int)((Math.random())*100000);
			
			
			
		}
		
		return result+"  "+otp;
		
	}
}
