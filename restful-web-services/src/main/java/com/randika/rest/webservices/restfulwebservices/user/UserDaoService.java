package com.randika.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService { //DAO - DataAccessObject
	private static List<User> users = new ArrayList<User>();
	private static int id = 0;
	{ //Static initializer
		users.add(new User(++id, "Randika", new Date()));
		users.add(new User(++id, "Nilawla", new Date()));
		users.add(new User(++id, "Prasad", new Date()));		
	}
	
	
	public List<User> findAll() {
		return users;
	}
	
	public User save(User user) {
		if (user.getId() == null) {
			user.setId(++id);
		}
		users.add(user);
		return user;
	}
	
	public User findOne(int id){
		for(User user: users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}
}
