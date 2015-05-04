package de.dhbw.socialfunnel.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import de.dhbw.socialfunnel.model.Networks;

@Transactional
@Component
public class NetworksDaoImpl implements NetworksDao{
	
	@PersistenceContext
	private EntityManager em;
	
	public int save(Networks network) {
		em.persist(network);
		return network.getNetworkId();
	}

    public void delete(int id){
    	em.remove(findById(id));
    }

	public List<Networks> getAll() {
        return em.createQuery("SELECT n FROM Networks n", Networks.class).getResultList();
	}

	public Networks findById(int id) {
		return em.createQuery("SELECT n FROM Networks n WHERE networkId ='"+id+"'", Networks.class).getSingleResult();
	}

}
