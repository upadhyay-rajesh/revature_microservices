package com.onlineshoping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.onlineshoping.dao.AmazonDAOInterface;
import com.onlineshoping.entity.AmazonUser;

@Service
@Transactional
public class AmazonUserService implements AmazonUserServiceInterface{
	
	@Autowired
	private AmazonDAOInterface adao;

	@Override
	public String loginUser(AmazonUser auser) {
		 AmazonUser aa= adao.loginUser(auser.getId(),auser.getPassword());
		 
		 String result="login is invalid";
		 
		 if(aa!=null) {
			 result="login is valid";
		 }
		return result;
	}

}
