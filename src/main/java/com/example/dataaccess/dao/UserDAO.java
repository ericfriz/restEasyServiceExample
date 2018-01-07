package com.example.dataaccess.dao;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import com.example.dataaccess.dao.exception.DaoException;
import com.example.dataaccess.po.User;
import com.example.db.UserStore;

@Model
public class UserDAO {

	@Inject
	UserStore userStore;
	
	public List<User> findAll() {
		return userStore.getAllUsers();
	}
	
	public User findUser(String name) throws DaoException{
		if (name == null) {
			throw new DaoException("ERR001");
		}
		return userStore.findUser(name);
	}
}
