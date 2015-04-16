package com.socialfunnel.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.socialfunnel.model.Networks;

@Transactional
@Component
public class NetworksDaoImpl implements NetworksDao{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public int save(Networks network) {
		// TODO Auto-generated method stub
		em.persist(network);
		return network.getNetworkId();
	}

    public void delete(int id){
    	em.remove(findById(id));
    }

	@Override
	public List<Networks> getAll() {
		// TODO Auto-generated method stub
        return em.createQuery("SELECT n FROM Networks n", Networks.class).getResultList();
	}

	@Override
	public Networks findById(int id) {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT n FROM Networks n WHERE networkId ='"+id+"'", Networks.class).getSingleResult();
	}

}
