package com.budgettracking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.budgettracking.model.OfficeExpenses;
import com.budgettracking.service.OfficeExpensesService;

@RestController
@RequestMapping("/api")
public class OfficeExpensesController {

	@Autowired
	private OfficeExpensesService oeService;
	
	
	
	/*
	 * ADD NEW RESOURCE SAVE DATA
	 */
	@PostMapping("/saveOE")
	public OfficeExpenses saveOfficeExpenses(@RequestBody OfficeExpenses oe) {
		return oeService.saveOfficeExpenses(oe);
	}
	
	
	/*
	 * GET ALL RESOURCE DATA IN LIST
	 */
	@GetMapping("/getAllOE")
	public List<OfficeExpenses> getAllOfficeExpenses() {
		return oeService.getAllOfficeExpenses();
	}
	
	
	
	
	/*
	 * GET RESOURCE DATA USING ID
	 */
      @GetMapping("/getOEById/{officeitemid}")
	public OfficeExpenses getOfficeExpensesById(@PathVariable("officeitemid")int officeitemid) {
		return oeService.getOfficeExpensesById(officeitemid);
	}
	
	
	
	
	
	/*
	 * DELETE EXIST RESOURCE DATA SAVE DATA
	 */
      @DeleteMapping("/deleteOEById/{officeitemid}")
	public String deleteOfficeExpenses(@PathVariable("officeitemid") int officeitemid) {
		oeService.deleteOfficeExpenses(officeitemid);
	return "office expenses data delete successfully ";
      }
	
	
	
	
	
	/*
	 * UPDATE EXIST RESOURCE DATA
	 */
      @PutMapping("/updateOEById/{officeitemid}")
	public OfficeExpenses updateOfficeExpenses(@RequestBody OfficeExpenses oe,@PathVariable("officeitemid") int officeitemid) {
		
	return oeService.updateOfficeExpenses(oe, officeitemid);
	}
}
