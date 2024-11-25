package com.example.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.entity.User;

@RestController // @RestController is a convenience annotation that combines @Controller and
				// @ResponseBody
public class UserController {

	// A method with @ResponseBody to return an object as JSON
	@GetMapping("/user")
	@ResponseBody
	public User getUser() {
		// Returning a User object which will be converted to JSON automatically
		return new User(1, "John Doe", "john.doe@example.com");
	}

	@GetMapping("/greet")
    public String greet(@RequestParam(value = "nam", required = true) String name) {
        if (name == null) {
            return "Hello, Guest!";
        } else {
            return "Hello, " + name;
}
    }
}
