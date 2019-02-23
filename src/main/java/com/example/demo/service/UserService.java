package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.User;

public interface UserService {
	
	User getUserByName(String name);
	
	List<User> findUsers();

}
