package com.budgettracking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.budgettracking.model.User;
import com.budgettracking.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	/**
	 * This method is used to add a new user to the system.
	 * 
	 * @param user The user object containing the details of the user to be added.
	 * @return The newly added user object.
	 */
	public User addNewUser(User user) {
		// Save the user object to the repository
		return userRepo.save(user);
	}

	/*
	 * This function retrieves all user data from the user repository.
	 */
	public List<User> getAllUser() {
		return userRepo.findAll();
	}

	/**
	 * Retrieves user data by the specified ID.
	 * 
	 * @param userid the unique identifier of the user
	 * @return the user object associated with the given ID
	 */
	public User getUserById(int userid) {
		return userRepo.findById(userid).get();
	}

	/**
	 * Deletes user data based on the provided user ID.
	 * 
	 * @param userId the ID of the user whose data will be deleted
	 */
	public void deleteUser(int userId) {
		userRepo.deleteById(userId);
	}

	/*
	 * This method updates the user data in the database based on the given userid.
	 * IllegalArgumentException with the message "user not found".
	 */
	public User updateUser(User user, int userid) {
		Optional<User> target = userRepo.findById(userid); // Find the user with the specified userid
		if (target.isPresent()) { // If the user is found
			User alreadyExist = target.get(); // Get the user from the Optional

			alreadyExist.setUsername(user.getUsername()); // Update the username
			alreadyExist.setFullname(user.getFullname()); // Update the fullname
			alreadyExist.setRole(user.getRole()); // Update the role
			alreadyExist.setPassword(user.getPassword()); 
			alreadyExist.setAddress(user.getAddress());
			alreadyExist.setCity(user.getCity());
			alreadyExist.setCountry(user.getCountry());
			alreadyExist.setDepartment(user.getDepartment());
			alreadyExist.setEmail_id(user.getEmail_id());
			alreadyExist.setDesignation(user.getDesignation());
			alreadyExist.setMobile_no(user.getMobile_no());
			alreadyExist.setPhone(user.getPhone());
			alreadyExist.setState(user.getState());
			alreadyExist.setZip(user.getZip());
			
			// Update the password
			return userRepo.save(alreadyExist); // Save the updated user to the repository
		}

		throw new IllegalArgumentException("user not found"); // If the user is not found, throw an exception
	}

}
