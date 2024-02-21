package com.budgettracking.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.budgettracking.model.FinancialBudget;
import com.budgettracking.repository.FinancialBudgetRepository;

@Service
public class FinancialBudgetService {

	@Autowired
	private FinancialBudgetRepository fbRepo;

	/**
	 * Saves a financial budget.
	 *
	 * @param fb the financial budget to be saved
	 * @return the saved financial budget
	 */
	public FinancialBudget saveFinancialBudget(FinancialBudget fb) {
		return fbRepo.save(fb);

	}

	/**
	 * Retrieve all financial budgets.
	 *
	 * @return list of financial budgets
	 */

	public List<FinancialBudget> getAllFinancialBudget() {
		return fbRepo.findAll();

	}

	/**
	 * Retrieves a FinancialBudget object by its ID.
	 *
	 * @param ftid the ID of the FinancialBudget to retrieve
	 * @return the FinancialBudget object with the specified ID
	 */
	public FinancialBudget getFinancialBudgetById(int ftid) {
		return fbRepo.findById(ftid).get();

	}

	/**
	 * Deletes a financial budget by the given ID.
	 *
	 * @param ftid the ID of the financial budget to be deleted
	 */
	public void deleteFinancialBudget(int ftid) {
		fbRepo.deleteById(ftid);

	}

	/**
	 * Updates the financial budget with the provided FinancialBudget object for the
	 * given ftid.
	 *
	 * @param fb   the FinancialBudget object to be updated
	 * @param ftid the ID of the financial budget to be updated
	 * @return the updated FinancialBudget object
	 */
	public FinancialBudget updateFinancialBudget(FinancialBudget fb, int ftid) {

		Optional<FinancialBudget> target = fbRepo.findById(ftid);
		if (target.isPresent()) {
			FinancialBudget alreadyExist = target.get();
			alreadyExist.setDate(fb.getDate());
			alreadyExist.setQ1(fb.getQ1());
			alreadyExist.setQ2(fb.getQ2());
			alreadyExist.setQ3(fb.getQ3());
			alreadyExist.setQ4(fb.getQ4());
//			alreadyExist.set
			return fbRepo.save(alreadyExist);
		}

		throw new IllegalArgumentException(" data not found ");

	}

	
	
	
	
	
	/**
	 * find  financial budget with the provided FinancialBudget object for the
	 * given Start Date and End Date .
	
	 */
	
	public List<FinancialBudget> findFinancialBudgetDate(Date start, Date end ) {
		return fbRepo.findFinancialBudgetDate(start, end);
	}
}
