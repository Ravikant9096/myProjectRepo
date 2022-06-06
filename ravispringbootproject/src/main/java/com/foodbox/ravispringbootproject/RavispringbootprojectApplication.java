package com.foodbox.ravispringbootproject;


import java.util.HashSet;
import java.util.Set;

import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import com.foodbox.ravispringbootproject.model.Role;
import com.foodbox.ravispringbootproject.model.User;
import com.foodbox.ravispringbootproject.model.UserRole;
import com.foodbox.ravispringbootproject.service.UserService;

@SpringBootApplication
public class RavispringbootprojectApplication  implements CommandLineRunner{

	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(RavispringbootprojectApplication.class, args);
		System.out.println("hellooooo ravi");
		//User user=new User();
	
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Starting Code");
//		User user=new User();
//		user.setUsername("Suresh Kumar");
//		user.setEmail("suresh@gmail.com");
//		user.setFirstName("Suresh");
//		user.setLastName("kumar");
//		user.setPassword("123456");
//		user.setPhone("9308099961");
		
		
//		Role role1=new Role();
//		role1.setRoleIdLong(2L);
//		role1.setRoleNameString("USER");
//		
//		Set<UserRole> userRoleSet=new HashSet<>();
//		UserRole userRole=new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		userRoleSet.add(userRole);
//		
//		User user1=this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUsername());
//		
		
		
	}

}
