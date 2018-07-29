package com.restapi.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi.springboot.model.User;;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}