package com.budgettracking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.budgettracking.model.HardwareCost;
import com.budgettracking.repository.HardwareCostRepository;

@Service
public class HardwareCostService {

	@Autowired
	private HardwareCostRepository hwRepo;

	/**
	 * This method saves the hardware cost data to the database.
	 * 
	 * @param hw the hardware cost object to be saved
	 * @return the saved hardware cost object
	 */
	public HardwareCost saveHardwareCost(HardwareCost hw) {
		return hwRepo.save(hw);
	}

	/**
	 * Retrieves all hardware cost data from the database.
	 * 
	 * @return List of HardwareCost objects containing all the hardware cost data.
	 */
	public List<HardwareCost> getAllHardwareCost() {
		return hwRepo.findAll();
	}

	/**
	 * Retrieves the hardware cost data for a particular resource by its ID.
	 * 
	 * @param hw_id The ID of the hardware resource
	 * @return The hardware cost data for the specified resource
	 */
	public HardwareCost getHardwareCostById(int hw_id) {
		return hwRepo.findById(hw_id).get();
	}

	/**
	 * Deletes the hardware cost with the given ID.
	 * 
	 * @param hw_id the ID of the hardware cost to be deleted
	 */
	public void deleteHardwareCost(int hw_id) {
		hwRepo.deleteById(hw_id);
	}

	/**
	 * Updates the HardwareCost with the provided HardwareCost object for the given
	 * hw_id.
	 *
	 * @param hw    the HardwareCost object to be updated
	 * @param hw_id the ID of the HardwareCost to be updated
	 * @return the updated HardwareCost object
	 */
	public HardwareCost updateHardwareCost(HardwareCost hw, int hw_id) {
		Optional<HardwareCost> target = hwRepo.findById(hw_id);
		if (target.isPresent()) {
			HardwareCost alreadyExist = target.get();
			alreadyExist.setDate(hw.getDate());
			alreadyExist.setHw_code(hw.getHw_code());
			alreadyExist.setHw_description(hw.getHw_description());
			alreadyExist.setHw_per_unit_cost(hw.getHw_per_unit_cost());
			alreadyExist.setHw_name(hw.getHw_name());
			alreadyExist.setHw_qty(hw.getHw_qty());
//			alreadyExist.set
			return hwRepo.save(alreadyExist);
		}

		throw new IllegalArgumentException("Hardware cost data not found");

	}

}
