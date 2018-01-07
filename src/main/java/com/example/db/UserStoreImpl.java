package com.example.db;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.enterprise.inject.Model;

import com.example.dataaccess.po.User;

@Model
public class UserStoreImpl implements UserStore{

	List<User> users = new ArrayList<User>();
	
	public UserStoreImpl() {
		users.add(new User("Pippo", "Friz", "via x", 30));
		users.add(new User("Pluto", "Frizzi", "via y", 40));
		
	}
	
	public List<User> getAllUsers(){
		return users;
	}
	
	public User findUser(String name){
		boolean found = false;
		User user = null;
		ListIterator<User> liUser = users.listIterator();
		while (!found && liUser.hasNext()){
			user = liUser.next();
			if (user.getName().equals(name)){
				found = true;
			} else {
				user =null;
			}
		}
		return user;
	}
}
