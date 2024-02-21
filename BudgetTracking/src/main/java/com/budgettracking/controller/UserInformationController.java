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

import com.budgettracking.model.UserInformation;
import com.budgettracking.service.UserInformationService;


public class UserInformationController {

//	@Autowired
//	private UserInformationService userInfoService;
//
//	/*
//	 * ADD NEW USER HERE ADD NEW RESOURCE
//	 */
//	@PostMapping("/saveUserInfo")
//	public UserInformation saveUserInformation(@RequestBody UserInformation userInfo) {
//		return userInfoService.saveUserInformation(userInfo);
//	}
//
//	/*
//	 * GET ALL USER DATA HERE GET DATA RESOURCE IN LIST
//	 */
//	@GetMapping("/getAllUserInfo")
//	public List<UserInformation> getAllUserInformation() {
//		return userInfoService.getAllUserInformation();
//	}
//
//	/*
//	 * GET PARTICULAR USER DATA HERE GET EXIST USER DATA USING ID RESOURCE
//	 */
//	@GetMapping("/getUserInfo/{infoid}")
//	public UserInformation getUserInformationById(@PathVariable("infoid") int infoid) {
//		return userInfoService.getUserInformationById(infoid);
//	}
//
//	/*
//	 * DELETE USER HERE DELETE EXIST DATA RESOURCE
//	 */
//	@DeleteMapping("/deleteUserInfo/{infoid}")
//	public String deleteUserInformation(@PathVariable("infoid")int infoid) {
//		userInfoService.deleteUserInformation(infoid);
//		return " User Information delete successfully ";
//	}
//
//	
//	/*
//	 * UPDATE USER HERE UPDATE ALREADY EXIST USER RESOURCE
//	 */
//
//	@PutMapping("/updateUserInfo/{infoid}")
//	public UserInformation UpdateUserInformation(@RequestBody UserInformation userInfo,
//			@PathVariable("infoid") int infoid) {
//		return userInfoService.updateUserInformation(userInfo, infoid);
//	}

}
