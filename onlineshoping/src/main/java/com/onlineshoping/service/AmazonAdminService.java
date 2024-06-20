package com.onlineshoping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.onlineshoping.dao.AmazonAdminDAOInterface;
import com.onlineshoping.entity.Product;

@Service
@Transactional
public class AmazonAdminService implements AmazonAdminServiceInterface{
	
	@Autowired
	private AmazonAdminDAOInterface adminDAO;

	@Override
	public Product createProductService(Product product) {
		adminDAO.save(product);
		return product;
	}

	@Override
	public List<Product> getAllProductService() {
		return adminDAO.findAll();
		
	}

}
