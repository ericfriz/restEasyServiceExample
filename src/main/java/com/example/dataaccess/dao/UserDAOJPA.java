package com.example.dataaccess.dao;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.persistence.Query;

import com.example.dataaccess.dao.exception.DaoException;
import com.example.dataaccess.po.User;
import com.example.db.UserStore;
import com.example.persistence.AbstractJpaDAO;

@Model
public class UserDAOJPA extends AbstractJpaDAO <User, Integer>{

	@Inject
	UserStore userStore;
	
	
	public UserDAOJPA() {
		this(User.class);
	}

	public UserDAOJPA(Class<User> clazz) {
		super(clazz);
	}
	
	
	public User findUserById(Integer id) throws DaoException{
		if (id == null) {
			throw new DaoException("ERR001");
		}
		return super.findOne(id);
	}
	
	
	@SuppressWarnings("unchecked")
	public List<User> findUserByName(String name) throws DaoException{
		if (name == null) {
			throw new DaoException("ERRNAME");
		}
		String qlString = "select distinct c.grade from USER u where u.name = :name";

		Query q = this.entityManager.createQuery(qlString);
		q.setParameter("name", name);
		return (List<User>) (q.getResultList());
	}
	
}
