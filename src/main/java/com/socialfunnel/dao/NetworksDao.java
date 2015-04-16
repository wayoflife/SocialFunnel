package com.socialfunnel.dao;

import java.util.List;

import com.socialfunnel.model.Networks;

public interface NetworksDao {
	
	int save (Networks network);
	void delete (int id);
	List<Networks> getAll();
	Networks findById (int id);

}
