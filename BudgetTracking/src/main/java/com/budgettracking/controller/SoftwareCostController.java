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

import com.budgettracking.model.SoftwareCost;
import com.budgettracking.service.SoftwareCostService;

@RestController
@RequestMapping("/api")
public class SoftwareCostController {

	
	
	@Autowired
	private SoftwareCostService costService;
	
	/*
	 * ADD NEW SoftwareCost HERE, ADD NEW RESOURCE
	 */
       @PostMapping("/saveSoftwareCost")
	public SoftwareCost saveSoftwareCost(@RequestBody SoftwareCost SwCost)
	{
		return costService.saveSoftwareCost(SwCost);
	}
	
	
	/*
	 * GET ALL SoftwareCost DATA HERE, GET DATA RESOURCE IN LIST
	 */
       @GetMapping("/getAllSoftwareCost")
	public List<SoftwareCost> getAllSoftwareCost( )
	{
		return costService.getAllSoftwareCost();
	}
	
	
	/*
	 * GET PARTICULAR SoftwareCost DATA HERE, GET EXIST SoftwareCost DATA USING ID RESOURCE
	 */
       @GetMapping("/getSoftwareCostById/{sw_id}")
	public SoftwareCost getSoftwareCostById(@PathVariable("sw_id") int sw_id)
	{
		return costService.getSoftwareCostById(sw_id);
	}
	

	/*
	 * DELETE SoftwareCost HERE, DELETE EXIST DATA RESOURCE
	 */
       @DeleteMapping("/deleteSoftwareCostByid/{sw_id}")
	public String deleteSoftwareCost(@PathVariable("sw_id")int sw_id)
	{
		costService.deleteSoftwareCost(sw_id);
		return " Software cost data deleted successfully";
		
	}
	

	/*
	 * UPDATE SoftwareCost HERE, UPDATE ALREADY EXIST SoftwareCost RESOURCE
	 */
     @PutMapping("/updateSoftwareCostById/{sw_id}")
	public SoftwareCost updateSoftwareCost(@RequestBody SoftwareCost SwCost,@PathVariable("sw_id")int sw_id)
	{
		return costService.updateSoftwareCost(SwCost, sw_id);
	}
	
}
