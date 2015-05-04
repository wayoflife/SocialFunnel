package de.dhbw.socialfunnel.dao;

import java.util.List;

import de.dhbw.socialfunnel.model.User;

public interface UserDao {


	int save (User user);
	void delete (int id);
	List<User> getAll();
	User findById (int id);
}
