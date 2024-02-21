package com.budgettracking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.budgettracking.model.User;
import com.budgettracking.service.UserService;



@RequestMapping("/api")
@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	
	
	
	
// This method is used to add a new user by sending a POST request to the "/saveUser" endpoint.
// It takes a User object in the request body and returns the added User object.
@PostMapping("/saveUser")
public User addNewUser(@RequestBody User user) {
    return userService.addNewUser(user);
}


	/*
 * This method retrieves all user data from the userService
 */
@GetMapping("/getAllUser")
public List<User> getAllUser() {
    return userService.getAllUser();
}

	/*
 * This method retrieves user data by the specified user ID.
 */
@GetMapping("/getUserById/{userid}")
public User getUserById(@PathVariable("userid") int userid) {
    return userService.getUserById(userid);
}

	/*
	 * DELETE USER DATA HERE
	 * 
	 */
	@DeleteMapping("/deleteUser/{userid}")
	public String deleteUser(@PathVariable("userid") int userid) {
		userService.deleteUser( userid);
		return "user details deleted successfully";
	}

	/*
	 * UPDATE USER DATA HERE
	 * 
	 */
	@PutMapping("/updateUser/{userid}")
	public User updateUser(@RequestBody User user, @PathVariable("userid")int userid) {
	 return userService.updateUser(user, userid);
	}
	
	
	
	
	
	
	
}
