package com.java.army.project.service;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.army.project.model.User;
import com.java.army.project.repository.UserRepo;

//import antlr.collections.List;

@Service
public class UserServiceImpl implements UserService {

	List<User> list;
 
	@Autowired
	private UserRepo userRepo;
	 
	public UserServiceImpl() {
	
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
	    userRepo.save(user);
		return  user;
	}

}
