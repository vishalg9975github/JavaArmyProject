package com.java.army.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.army.project.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
