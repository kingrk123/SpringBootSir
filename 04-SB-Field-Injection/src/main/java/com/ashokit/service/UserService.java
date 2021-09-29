package com.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.dao.UserDao;

@Service
public class UserService {

	@Autowired(required=false)
	private UserDao dao;

	public void printUsername(Integer id) {
		String name = dao.findNameById(id);
		System.out.println(name);
	}
}
