package com.solutions.getSolutions.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solutions.getSolutions.dao.User;
import com.solutions.getSolutions.service.UserService;

@RestController
public class Controller {
	
	private final UserService userService;

    public Controller(UserService userService) {
        this.userService = userService;
    }
	
	 @GetMapping("/home")
	    public String home() {
	        return "Welcome to GetSolutions!";
	    }
	 
	 @GetMapping("/users")
	    public List<User> getUsers() {
	        return userService.getAllUsers();
	    }

}
