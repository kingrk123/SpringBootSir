package com.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.dao.UserDao;

@Service
public class UserService {

	public UserService() {
		System.out.println("UserService::Constructor");
	}

	private UserDao userDao;
	
	@Autowired
	public void setUserDao(UserDao userDao) {
		System.out.println("setUserDao() method called ");
		this.userDao = userDao;
	}

	public void printUsername(Integer id) {
		String name = userDao.findNameById(id);
		System.out.println(name);
	}

}
