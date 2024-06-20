package com.onlineshoping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshoping.entity.Product;
import com.onlineshoping.service.AmazonAdminServiceInterface;

@RestController
public class AmazonAdminController {
	
	@Autowired
	private AmazonAdminServiceInterface adminInterface;

	@PostMapping("addProduct")
	public Product createProduct(@RequestBody Product product) {
		return adminInterface.createProductService(product);
	}
	
	@GetMapping("viewAll")
	public List<Product> getAllList(){
		return adminInterface.getAllProductService();
	}
}
