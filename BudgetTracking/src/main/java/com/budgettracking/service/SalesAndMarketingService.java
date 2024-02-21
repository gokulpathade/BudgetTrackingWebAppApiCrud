package com.budgettracking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.budgettracking.model.SalesAndMarketing;
import com.budgettracking.repository.SalesAndMarketingRepository;

@Service
public class SalesAndMarketingService {

	@Autowired
	private SalesAndMarketingRepository smRepo;

	/**
	 * Save the SalesAndMarketing resource.
	 * 
	 * @param sm the SalesAndMarketing object to be saved
	 * @return the saved SalesAndMarketing object
	 */
	public SalesAndMarketing saveSalesAndMarketing(SalesAndMarketing sm) {
		return smRepo.save(sm);
	}

	/*
	 * This method retrieves all sales and marketing resources from the repository.
	 */
	public List<SalesAndMarketing> getAllSalesAndMarketing() {
		return smRepo.findAll();
	}

	/**
	 * Retrieve a specific SalesAndMarketing resource by its ID.
	 * 
	 * @param smid The ID of the SalesAndMarketing resource to retrieve
	 * @return The SalesAndMarketing resource with the specified ID
	 */
	public SalesAndMarketing getSalesAndMarketingById(int smid) {
		return smRepo.findById(smid).get();
	}

	// This method deletes a sales and marketing entry based on the provided ID.
	public void deleteSalesAndMarketing(int smid) {
		smRepo.deleteById(smid);
	}

	/**
	 * Updates the SalesAndMarketing object with the given id by replacing its
	 * attributes with the ones from the provided SalesAndMarketing object.
	 *
	 * @param sm   the SalesAndMarketing object to be updated
	 * @param smid the id of the SalesAndMarketing object to be updated
	 * @return the updated SalesAndMarketing object
	 */

	public SalesAndMarketing updateSalesAndMarketing(SalesAndMarketing sm, int smid) {

		Optional<SalesAndMarketing> target = smRepo.findById(smid);

		if (target.isPresent()) {
			SalesAndMarketing alreadyExist = target.get();
			alreadyExist.setSm_cost(sm.getSm_cost());
			alreadyExist.setSm_date(sm.getSm_date());
			alreadyExist.setSm_description(sm.getSm_description());
			alreadyExist.setSm_place(sm.getSm_place());
			alreadyExist.setSm_type(sm.getSm_type());
//			alreadyExist.set
			return smRepo.save(alreadyExist);
		}

		throw new IllegalArgumentException(" SalesAndMarketing data not found ");
	}

}
