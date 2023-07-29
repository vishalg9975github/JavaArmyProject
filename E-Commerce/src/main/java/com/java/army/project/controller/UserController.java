package com.java.army.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/*
 * @auther:Nileishdl
 * 
 */

import com.java.army.project.model.User;
import com.java.army.project.service.UserService;
@RestController
public class UserController {

	@Autowired
	private UserService userService;
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		
		return this.userService.addUser(user);
	}
	
}
