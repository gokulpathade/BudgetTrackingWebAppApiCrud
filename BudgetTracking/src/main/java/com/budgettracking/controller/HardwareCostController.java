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

import com.budgettracking.model.HardwareCost;
import com.budgettracking.service.HardwareCostService;

@RestController
@RequestMapping("/api")
public class HardwareCostController {

	
	
	
	@Autowired
	private HardwareCostService hwService;
	
	
	
	/*
	 * ADD NEW RESOURCE DATA SAVE DATA
	 */
	@PostMapping("/saveHW")
	public HardwareCost saveHardwareCost(@RequestBody HardwareCost hw) {
		return hwService.saveHardwareCost(hw);

	}
	
	
	
	
	/*
	 * GET ALL RESOURCE DATA UI LIST 
	 */
	@GetMapping("/getAllHW")
	public List<HardwareCost> getAllHardwareCost() {
		return hwService.getAllHardwareCost();

	}
	
	
	/*
	 * GET PARTICULAR RESOURCE DATA 
	 */
	@GetMapping("/getHWById/{hw_id}")
	public HardwareCost getHardwareCostById( @PathVariable("hw_id")int hw_id) {
		return hwService.getHardwareCostById(hw_id);
	}
	
	
	
	/*
	 *  DELETE EXIST RESOURCE DATA 
	 */
	@DeleteMapping("/deleteHWById/{hw_id}")
	public String deleteHardwareCost( @PathVariable("hw_id")int hw_id) {
		hwService.deleteHardwareCost(hw_id);
      return "HARDWARE COST DATA DELETE  SUCCESSFULLY";
	}
	
	
	/*
	 * UPDATE EXIST RESOURCE DATA SAVE DATA
	 */
	@PutMapping("/updateHWById/{hw_id}")
	public HardwareCost updateHardwareCost(@RequestBody HardwareCost hw,@PathVariable("hw_id")int hw_id) {
		return hwService.updateHardwareCost(hw, hw_id);
	}
}
