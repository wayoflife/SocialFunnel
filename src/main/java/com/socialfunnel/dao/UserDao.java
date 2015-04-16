package com.socialfunnel.dao;

import java.util.List;

import com.socialfunnel.model.User;

public interface UserDao {


	int save (User user);
	void delete (int id);
	List<User> getAll();
	User findById (int id);
}
