package com.budgettracking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.budgettracking.model.SoftwareCost;
import com.budgettracking.repository.SoftwareCostRepository;

@Service
public class SoftwareCostService {

	@Autowired
	private SoftwareCostRepository swCostRepo;

	/**
	 * Saves a software cost.
	 *
	 * @param SwCost the software cost to be saved
	 * @return the saved software cost
	 */
	public SoftwareCost saveSoftwareCost(SoftwareCost SwCost) {
		return swCostRepo.save(SwCost);
	}

	/**
	 * Retrieves all software cost data from the repository.
	 * 
	 * @return a list of all software cost entries
	 */
	public List<SoftwareCost> getAllSoftwareCost() {
		return swCostRepo.findAll();
	}

	/**
	 * Retrieves the software cost data for a particular software using the provided
	 * ID.
	 * 
	 * @param softwareId the ID of the software cost data to retrieve
	 * @return the software cost data identified by the provided ID
	 */
	public SoftwareCost getSoftwareCostById(int softwareId) {
		return swCostRepo.findById(softwareId).get();
	}

	/**
	 * Deletes the software cost data for the given software ID.
	 * 
	 * @param softwareId the ID of the software for which the cost data should be
	 *                   deleted
	 */
	public void deleteSoftwareCost(int softwareId) {
		swCostRepo.deleteById(softwareId);
	}

	/**
	 * Updates the software cost with the given software cost and software ID.
	 *
	 * @param SwCost the new software cost to update
	 * @param sw_id  the ID of the software
	 * @return the updated software cost
	 */
	public SoftwareCost updateSoftwareCost(SoftwareCost SwCost, int sw_id) {
		Optional<SoftwareCost> target = swCostRepo.findById(sw_id);
		if (target.isPresent()) {
			SoftwareCost alreadyExist = target.get();
			alreadyExist.setDate(SwCost.getDate());
			alreadyExist.setSw_code(SwCost.getSw_code());
			alreadyExist.setSw_cost_perunit(SwCost.getSw_cost_perunit());
			alreadyExist.setSw_description(SwCost.getSw_description());
			alreadyExist.setSw_name(SwCost.getSw_name());
			alreadyExist.setSw_qty(SwCost.getSw_qty());
			alreadyExist.setSw_type(SwCost.getSw_type());
			alreadyExist.setSw_qty(SwCost.getSw_qty());
			alreadyExist.setSw_totalcost(SwCost.getSw_totalcost());
//			alreadyExist.set
			return swCostRepo.save(alreadyExist);
		}

		throw new IllegalArgumentException("user Not Found ");
	}
}
