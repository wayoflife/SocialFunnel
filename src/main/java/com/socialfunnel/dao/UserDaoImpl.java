package com.socialfunnel.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.socialfunnel.model.User;

@Transactional
@Component
public class UserDaoImpl implements UserDao {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public int save(User user) {
		// TODO Auto-generated method stub
		em.persist(user);
		return user.getUserId();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		em.remove(findById(id));
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
        return em.createQuery("SELECT u FROM User u", User.class).getResultList();
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT u FROM User u WHERE userId ='"+id+"'", User.class).getSingleResult();
	}


}
