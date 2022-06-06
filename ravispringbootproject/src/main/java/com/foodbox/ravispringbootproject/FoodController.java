package com.foodbox.ravispringbootproject;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodbox.ravispringbootproject.model.Role;
import com.foodbox.ravispringbootproject.model.User;
import com.foodbox.ravispringbootproject.model.UserRole;
import com.foodbox.ravispringbootproject.service.UserService;

@RestController
//@ResponseBody
@RequestMapping("/user")
@CrossOrigin("*")
public class FoodController {
	@Autowired
	private UserService userService;
	// creating user
	@PostMapping("/")
	public User createUser(@RequestBody User user) throws Exception {
		
		Set<UserRole> roles=new HashSet<>();
		Role role=new Role();
		role.setRoleIdLong(2L);
		role.setRoleNameString("USER");
		UserRole userRole=new UserRole();
		userRole.setUser(user);
		userRole.setRole(role);
		
		roles.add( userRole);
		return this.userService.createUser(user, roles);
	}
	
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username) {
		return this.userService.getUser(username);
		
	}
	
	//delete
	@DeleteMapping("/{userId}")
	public void deleteUser(@PathVariable("userId") Long userId) {
		
		this.userService.deleteUser(userId);
	}
	
	
	
	

//	@RequestMapping("/home")
//	public String firstHandler()
//	{
//		return "Home page for Foodbox ";
//	}
//	
//	@RequestMapping("/add")
//	public String secondHandler()
//	{
//		return "Add page for Foodbox ";
//	}
//	
//	@RequestMapping("/read")
//	public String thirdHandler()
//	{
//		return "Read page for Foodbox ";
//	}
}
