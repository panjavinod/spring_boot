package com.demo.UserRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.User;



public interface UserRepo extends JpaRepository<User,Integer>{

	boolean existsByEmail(String email);

	boolean existsByPassword(String password);

}
