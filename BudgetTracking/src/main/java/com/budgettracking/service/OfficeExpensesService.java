package com.budgettracking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.budgettracking.model.OfficeExpenses;
import com.budgettracking.repository.OfficeExpensesRepository;

@Service
public class OfficeExpensesService {

	@Autowired
	private OfficeExpensesRepository oeRepo;

	/**
	 * Saves the office expenses data.
	 * 
	 * @param oe the office expenses to be saved
	 * @return the saved office expenses
	 */
	public OfficeExpenses saveOfficeExpenses(OfficeExpenses oe) {
		return oeRepo.save(oe);
	}

	/*
	 * This function retrieves all office expenses data from the repository.
	 */
	public List<OfficeExpenses> getAllOfficeExpenses() {
		return oeRepo.findAll();
	}

	/**
	 * Retrieve office expenses data by ID
	 */
	public OfficeExpenses getOfficeExpensesById(int officeItemId) {
		// Retrieve office expenses data from repository by ID
		return oeRepo.findById(officeItemId).get();
	}

	/**
	 * Deletes office expenses data for the given office item ID.
	 * 
	 * @param officeItemId the ID of the office item for which the expenses data
	 *                     should be deleted
	 */
	public void deleteOfficeExpenses(int officeItemId) {
		oeRepo.deleteById(officeItemId);
	}

// This method updates the office expenses data for a specific office item with the provided OfficeExpenses object and office item ID
	public OfficeExpenses updateOfficeExpenses(OfficeExpenses oe, int officeitemid) {
		// Retrieve the office expenses data for the given office item ID
		Optional<OfficeExpenses> target = oeRepo.findById(officeitemid);

		// If the office expenses data for the given ID is present, update the existing
		// data and save it
		if (target.isPresent()) {
			OfficeExpenses alreadyExist = target.get();
			alreadyExist.setDate(oe.getDate());
			alreadyExist.setItem_quantity(oe.getItem_quantity());
			alreadyExist.setItemcost(oe.getItemcost());
			alreadyExist.setItemdescription(oe.getItemdescription());
			alreadyExist.setItemname(oe.getItemname());
			alreadyExist.setItemtype(oe.getItemtype());
			return oeRepo.save(alreadyExist);
		}

		// If the office expenses data for the given ID is not present, throw an
		// exception
		throw new IllegalArgumentException("Office Expenses data not found");
	}

}
