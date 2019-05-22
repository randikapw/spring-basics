package com.randika.rest.webservices.restfulwebservices.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	
	//POST /users
	// To create new user.
	// Output - status: Created and uri for specific user
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@RequestBody User user) {
		User savedUser = userService.save(user);
		
		// To return the uri of created user
		//  Get uri of current request (host/users) and append the id of new user
		URI location = ServletUriComponentsBuilder
			.fromCurrentRequest() // get current path
			.path("/{id}") //extend new path with variable
			.buildAndExpand(savedUser.getId()) //map values to variable
			.toUri(); //Generate final uri
		
		return ResponseEntity.created(location).build(); // return status 201 created with 
		// the uri of newly created user
			
	}
}
