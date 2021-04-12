package br.com.fiap.dao;

import javax.persistence.EntityManager;

import br.com.fiap.model.User;
import br.com.fiap.util.JPAUtil;

public class UserDAO {
	private EntityManager manager = JPAUtil.getEntityManager();
	
	public void save (User user) {
		manager.getTransaction().begin();
		manager.persist(user);
		manager.getTransaction().commit();
		manager.close();
	}
}
