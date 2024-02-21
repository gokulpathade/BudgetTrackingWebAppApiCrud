package com.budgettracking.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.budgettracking.model.UserInformation;
//import com.budgettracking.repository.UserInformationRepository;


public class UserInformationService {

//	@Autowired
//	private UserInformationRepository userInformationRepo;
//
//	/**
//	 * Save user information to the database.
//	 * 
//	 * @param userInfo The user information to be saved
//	 * @return The saved user information
//	 */
//	public UserInformation saveUserInformation(UserInformation userInfo) {
//		return userInformationRepo.save(userInfo);
//	}
//
//	/**
//	 * Retrieve all user information from the repository.
//	 * 
//	 * @return a list of UserInformation objects containing all user data
//	 */
//	public List<UserInformation> getAllUserInformation() {
//		return userInformationRepo.findAll();
//	}
//
//	/**
//	 * Retrieves user information by ID.
//	 * 
//	 * @param infoid The ID of the user information to retrieve
//	 * @return The user information with the specified ID
//	 */
//	public UserInformation getUserInformationById(int infoid) {
//		return userInformationRepo.findById(infoid).get();
//	}
//
//	/**
//	 * Delete user information by the provided info ID. This method deletes the
//	 * existing data resource associated with the info ID.
//	 * 
//	 * @param infoId the ID of the information to be deleted
//	 */
//	public void deleteUserInformation(int infoId) {
//		userInformationRepo.deleteById(infoId);
//	}
//
//	/**
//	 * Update user information by finding the user with the given info id and
//	 * updating their details. If the user is found, update their information and
//	 * save the changes to the repository. If the user is not found, throw an
//	 * IllegalArgumentException.
//	 */
//	public UserInformation updateUserInformation(UserInformation userInfo, int infoId) {
//		// Find the user information with the given infoId
//		Optional<UserInformation> target = userInformationRepo.findById(infoId);
//
//		// If the user information is found, update the details and save the changes
//		if (target.isPresent()) {
//			UserInformation existingUserInfo = target.get();
//			existingUserInfo.setAddress(userInfo.getAddress());
//			existingUserInfo.setCity(userInfo.getCity());
//			existingUserInfo.setCountry(userInfo.getCountry());
//			existingUserInfo.setDepartment(userInfo.getDepartment());
//			existingUserInfo.setEmail_id(userInfo.getEmail_id());
//			existingUserInfo.setDesignation(userInfo.getDesignation());
//			existingUserInfo.setMobile_no(userInfo.getMobile_no());
//			existingUserInfo.setPhone(userInfo.getPhone());
//			existingUserInfo.setState(userInfo.getState());
//			existingUserInfo.setZip(userInfo.getZip());
//			return userInformationRepo.save(existingUserInfo);
//		}
//
//		// If the user information is not found, throw an IllegalArgumentException
//		throw new IllegalArgumentException("User not found");
//	}

}
