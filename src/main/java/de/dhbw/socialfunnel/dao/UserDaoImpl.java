package de.dhbw.socialfunnel.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import de.dhbw.socialfunnel.model.User;

@Transactional
@Component
public class UserDaoImpl implements UserDao{
	
	@PersistenceContext
	private EntityManager em;

	public int save(User user) {
		em.persist(user);
		return user.getUserId();
	}

	public void delete(int id) {
		em.remove(findById(id));
		
	}

	public List<User> getAll() {
        return em.createQuery("SELECT u FROM User u", User.class).getResultList();
	}

	public User findById(int id) {
		return em.createQuery("SELECT u FROM User u WHERE userId ='"+id+"'", User.class).getSingleResult();
	}

	@Override
	public User findByEmail(String email) {
		User foundUser = null;
		try {
			foundUser = em.createQuery("SELECT u FROM User u WHERE email ='"+email+"'", User.class).getSingleResult();
		} catch (NoResultException e) {
		}
		return foundUser;
	}


}
