package com.example.db;

import java.util.List;

import com.example.dataaccess.po.User;

public interface UserStore {

	public List<User> getAllUsers();
	public User findUser(String name);
}
