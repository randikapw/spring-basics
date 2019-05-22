package com.randika.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {
	
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}
	
	//hello-world-bean : Resource which return object instead of String.
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World!");
	}
	// When requesting above resource spring will smoothly convert java object to json.
	// We don't need to any specific conversion.

}
