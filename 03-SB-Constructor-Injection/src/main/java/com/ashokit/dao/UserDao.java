package com.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	public UserDao() {
		System.out.println("UserDao::Constructor");
	}

	public String findNameById(Integer id) {
		if (id == 101) {
			return "John";
		} else if (id == 102) {
			return "Smith";
		}
		return null;
	}

}
