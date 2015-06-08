package de.dhbw.socialfunnel.dao;

import java.util.List;

import de.dhbw.socialfunnel.model.Networks;
import de.dhbw.socialfunnel.model.User;

public interface NetworksDao {
	
	int save (Networks network);
	void delete (int id);
	List<Networks> getAll();
	Networks findById (int id);
	List<Networks> findByUser (User user);

}
