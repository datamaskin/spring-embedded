package com.swacorp.dao;

import java.util.List;

import com.swacorp.model.User;

public interface UserDao {

	User findByName(String name);
	
	List<User> findAll();

}