package com.java.army.project.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.army.project.model.User;
import com.java.army.project.repository.UserRepository;
import com.java.army.project.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired
	private UserRepository userRepository;

	/*
	 * @Author:-Vishal Waghmare
	 *
	 */
	@Override
	public User updateUser(User user) {
		Integer id = user.getId();
		User user2 = userRepository.findById(id).get();
		user2.setUsername(user.getUsername());
		user2.setPassword(user.getPassword());
		user2.setRealName(user.getRealName());
		user2.setGender(user.getGender());
		user2.setUserType(user.getUserType());
		user2.setBirthday(user.getBirthday());
		logger.info("In the UserServiceImpl class updateUser method");
		return userRepository.save(user2);
	}

}
