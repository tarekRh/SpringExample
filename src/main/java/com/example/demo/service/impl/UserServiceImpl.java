package com.example.demo.service.impl;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.domain.User;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@PostConstruct
	private void init() {
		
		User user = new User();
		user.setName("Tarek");
		user.setLastName("Rhaimi");
		user.setAge(21);
		userDao.save(user);
	}
	
	@Override
	public User getUserByName(String name) {
		return userDao.findByName(name);
	}

	@Override
	public List<User> findUsers() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

}
