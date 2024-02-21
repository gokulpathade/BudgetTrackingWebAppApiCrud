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

import com.budgettracking.model.SalesAndMarketing;
import com.budgettracking.repository.SalesAndMarketingRepository;
import com.budgettracking.service.SalesAndMarketingService;

@RestController
@RequestMapping("/api")
public class SalesAndMarketingController {

	@Autowired
	private SalesAndMarketingService smService;
	
	
	/*
	 * ADD New Resource
	 */
	@PostMapping("/saveSalesAndMarketing")
	public SalesAndMarketing saveSalesAndMarketing(@RequestBody SalesAndMarketing sm) {
		return smService.saveSalesAndMarketing(sm);
	}
	
	
	/*
	 * GET ALL Resource IN LIST
	 */
	@GetMapping("/getSalesAndMarketing")
	public List<SalesAndMarketing> getAllSalesAndMarketing() {
		return smService.getAllSalesAndMarketing();
	}
	
	
	/*
	 * GET PARTICULAR Resource USING ID
	 */
	@GetMapping("/getSalesAndMarketingById/{smid}")
	public SalesAndMarketing getSalesAndMarketingById(@PathVariable("smid")int smid) {
		return smService.getSalesAndMarketingById(smid);
	}
	
	
	
	/*
	 * DELETE EXIST Resource
	 */
	@DeleteMapping("/deleteSalesAndMarketingById/{smid}")
	public String deleteSalesAndMarketing( @PathVariable("smid")int smid ) {
		smService.deleteSalesAndMarketing(smid);
	return "Sales And Marketing data deleted successfully ";
	}
	
	
	
	/*
	 * UPDATE EXISTING Resource
	 */
	@PutMapping("/UpdateSalesAndMarketingById/{smid}")
	public SalesAndMarketing updateSalesAndMarketing(@RequestBody SalesAndMarketing sm, @PathVariable("smid")int smid) {
		return smService.updateSalesAndMarketing(sm, smid);
	}
}
