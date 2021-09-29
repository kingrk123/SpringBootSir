package com.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ashokit.dao.ReportDao;
import com.ashokit.dao.UserDao;

@Service
public class UserService {

	private UserDao userDao;
	
	@Autowired
	public UserService(UserDao userDao, ReportDao reportDao) {
		System.out.println("UserService:: 2 - param Constructor");
		this.userDao = userDao;
	}

	public void printUsername(Integer id) {
		String name = userDao.findNameById(id);
		System.out.println(name);
	}

}
