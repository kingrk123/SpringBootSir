package com.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

	public String findNameById(Integer id);

}
