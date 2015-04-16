package com.socialfunnel.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

@Transactional
@Component
public class NetworksDaoImpl implements NetworksDao{
	
	@PersistenceContext
	private EntityManager em;

}
