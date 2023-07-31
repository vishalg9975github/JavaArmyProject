package com.java.army.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.java.army.project.exceptions.NotFoundException;
import com.java.army.project.model.User;
import com.java.army.project.repository.UserRepository;

@RestController
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserRepository userRepository;

	/*
	 * @Author:- Vishal Waghmare
	 */
	@PutMapping("/updateuser/{id}")
	public User updateUser(@PathVariable Integer id, @RequestBody User user) {
		User user1 = userRepository.findById(id)
				.orElseThrow(() -> new NotFoundException("User not found with id: " + id));

		// Update the user details with the new data
		user1.setUsername(user.getUsername());
		user1.setPassword(user.getPassword());
		user1.setRealName(user.getRealName());
		user1.setBirthday(user.getBirthday());
		user1.setGender(user.getGender());
		user1.setUserType(user.getUserType());
		logger.info("In the UserController class updateUser method");
		return userRepository.save(user1);
	}
}
