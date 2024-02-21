package com.budgettracking.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.budgettracking.model.FinancialBudget;
import com.budgettracking.service.FinancialBudgetService;

@RequestMapping("/api")
@RestController
public class FinancialBudgetcontroller {

	@Autowired
	private FinancialBudgetService fbService;

	/*
	 * This method receives a POST request to save a new financial budget data
	 * resource. It takes in a FinancialBudget object from the request body and
	 * calls the fbService to save it. It then returns the saved FinancialBudget
	 * object.
	 */
	@PostMapping("/saveFB")
	public FinancialBudget saveFinancialBudget(@RequestBody FinancialBudget fb) {
		return fbService.saveFinancialBudget(fb);
	}

	/*
	 * This method retrieves all financial budget data from the data resource and
	 * returns it as a list.
	 */
	@GetMapping("/getAllFB")
	public List<FinancialBudget> getAllFinancialBudget() {
		return fbService.getAllFinancialBudget();
	}

	/*
	 * This method retrieves a financial budget by its ID. It uses a GET request to
	 * the "/getFBById/{ftid}" endpoint. The ID of the financial budget is specified
	 * in the path variable "ftid". It returns the financial budget object
	 * corresponding to the provided ID.
	 */
	@GetMapping("/getFBById/{ftid}")
	public FinancialBudget getFinancialBudgetById(@PathVariable("ftid") int ftid) {
		return fbService.getFinancialBudgetById(ftid);
	}

	/*
	 * This method handles the deletion of a financial budget data resource using
	 * its ID.
	 */
	@DeleteMapping("/deleteFB/{ftid}")
	public String deleteFinancialBudget(@PathVariable("ftid") int ftid) {
		// Call the service to delete the financial budget data using the provided ID
		fbService.deleteFinancialBudget(ftid);
		// Return a success message
		return "Financial Budget data deleted successfully";
	}

	/*
	 * This method handles the HTTP PUT request to update a FinancialBudget resource
	 * by its ID. It takes the updated FinancialBudget object from the request body
	 * and the ID of the FinancialBudget to be updated.
	 */
	@PutMapping("/updateFB/{ftid}")
	public FinancialBudget updateFinancialBudget(@RequestBody FinancialBudget updatedFinancialBudget,
			@PathVariable("ftid") int financialBudgetId) {
		return fbService.updateFinancialBudget(updatedFinancialBudget, financialBudgetId);
	}

	/**
	 * find  financial budget with the provided FinancialBudget object for the
	 * given Start Date and End Date .
	
	 */
	
	@GetMapping("/getDataBetweenDate")
	public List<FinancialBudget> findFinancialBudgetDate(
			@PathVariable("start") @DateTimeFormat(pattern = "yyyy-MM-dd") Date start,
			@PathVariable("end") @DateTimeFormat(pattern = "yyyy-MM-dd") Date end) {
		return fbService.findFinancialBudgetDate(start, end);
	}

}
