package com.restapi.springbootREST.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi.springbootREST.model.User;;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}