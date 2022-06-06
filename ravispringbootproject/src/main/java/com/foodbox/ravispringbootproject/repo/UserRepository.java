package com.foodbox.ravispringbootproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodbox.ravispringbootproject.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
//all repository have interface
	
	public User findByUsername(String username);
}
