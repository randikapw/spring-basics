package com.randika.rest.webservices.restfulwebservices.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	@Autowired
	private UserDaoService userService;

	//GET /users
	//RetreiveAllUsers
	@GetMapping("/users")
	public List<User> retrieveAllUsers() {
		return userService.findAll();
	}
	
	
	//GET /users/{id}
	//retreiveUserbyId
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id) {
		return userService.findOne(id);
	}
}
