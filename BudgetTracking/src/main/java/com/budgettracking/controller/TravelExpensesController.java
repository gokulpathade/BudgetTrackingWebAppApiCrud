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

import com.budgettracking.model.TravelExpenses;
import com.budgettracking.service.TravelExpensesService;

@RestController
@RequestMapping("/api")
public class TravelExpensesController {

	
	@Autowired
     private TravelExpensesService travelExpService;
	
	
	/*
	 * ADD NEW TravelExpenses HERE ADD NEW RESOURCE
	 */
     @PostMapping("/saveTravelExpenses")
	public TravelExpenses saveTravelExpenses(@RequestBody TravelExpenses travelExp)
	{
		return travelExpService.saveTravelExpenses(travelExp);
	}
	

	/*
	 * GET ALL TravelExpenses DATA HERE GET DATA RESOURCE IN LIST
	 */
	@GetMapping("/getAllTravelExpenses")
	public List<TravelExpenses> getAllTravelExpenses()
	{
		return travelExpService.getAllTravelExpenses();
	}
	


	/*
	 * GET PARTICULAR TravelExpenses DATA HERE GET EXIST TravelExpenses DATA USING ID RESOURCE
	 */
	@GetMapping("/getTravelExpenses/{travelid}")
	public TravelExpenses getTravelExpensesById(@PathVariable("travelid")int travelid)
	{
		return travelExpService.getTravelExpensesById(travelid);
	}
	

	
	
	/*
	 * DELETE TravelExpenses HERE DELETE EXIST DATA RESOURCE
	 */
	@DeleteMapping("/deleteTravelExpenses/{travelid}")
	public String deleteTravelExpenses(@PathVariable("travelid")int travelid)
	{
		travelExpService.deleteTravelExpenses(travelid);
		return "Travel Expenses delete successfully";
		
	}
	


	/*
	 * UPDATE TravelExpenses HERE UPDATE ALREADY EXIST TravelExpenses RESOURCE
	 */
@PutMapping("/updateTravelExpenses/{travelid}")
	public TravelExpenses updateTravelExpenses(@RequestBody TravelExpenses travelExp,@PathVariable("travelid")int travelid)
	{
		return travelExpService.updateTravelExpenses(travelExp, travelid);
	}
	
	
	
}
