package com.onlineshoping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.onlineshoping.entity.AmazonUser;

@Repository
public interface AmazonDAOInterface extends JpaRepository<AmazonUser, String>{

	@Query("from com.onlineshoping.entity.AmazonUser a where a.id=:uid and a.password=:pass")
	AmazonUser loginUser(@Param("uid") String id,@Param("pass") String password);

}
