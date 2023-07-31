package com.java.army.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.army.project.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
