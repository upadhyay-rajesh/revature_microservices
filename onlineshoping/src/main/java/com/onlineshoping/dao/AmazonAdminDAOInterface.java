package com.onlineshoping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineshoping.entity.Product;

@Repository
public interface AmazonAdminDAOInterface extends JpaRepository<Product, Long>{

}
