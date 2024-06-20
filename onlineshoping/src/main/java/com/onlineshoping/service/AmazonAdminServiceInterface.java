package com.onlineshoping.service;

import java.util.List;

import com.onlineshoping.entity.Product;

public interface AmazonAdminServiceInterface {

	Product createProductService(Product product);

	List<Product> getAllProductService();

}
