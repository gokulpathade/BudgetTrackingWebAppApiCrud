package com.budgettracking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.budgettracking.model.TravelExpenses;
import com.budgettracking.repository.TravelExpensesRepository;

@Service
public class TravelExpensesService {

	@Autowired
  private TravelExpensesRepository travelExpRepo;

/**
 * This method saves the travel expenses for a given TravelExpenses object.
 * 
 * @param travelExp The TravelExpenses object containing the travel expenses to be saved
 * @return The saved TravelExpenses object
 */
public TravelExpenses saveTravelExpenses(TravelExpenses travelExp)
{
    return travelExpRepo.save(travelExp);
}

		/**
	 * Retrieves all travel expenses.
	 *
	 * @return  a list of travel expenses
	 */
	
	public List<TravelExpenses> getAllTravelExpenses()
	{
		return travelExpRepo.findAll();
	}
	


	/**
 * Retrieves a specific TravelExpenses object based on the provided ID.
 * 
 * @param travelid the ID of the TravelExpenses to retrieve
 * @return the TravelExpenses object with the specified ID
 */
public TravelExpenses getTravelExpensesById(int travelid) {
    return travelExpRepo.findById(travelid).get();
}

	
	
		/**
	 * Deletes travel expenses by travel ID.
	 *
	 * @param  travelid  the ID of the travel expenses to be deleted
	 * @return          void
	 */
	public void deleteTravelExpenses(int travelid)
	{
		 travelExpRepo.deleteById(travelid);
	}
	

	/**
	 * Updates the travel expenses with the given travel ID.
	 *
	 * @param  travelExp     the new travel expenses to update
	 * @param  travelid      the ID of the travel expenses to update
	 * @return               the updated travel expenses
	 */
	public TravelExpenses updateTravelExpenses(TravelExpenses travelExp, int travelid)
	{
		Optional<TravelExpenses> target =travelExpRepo.findById(travelid);
		if (target.isPresent()) {
			
			TravelExpenses alreadyExist= target.get();
			alreadyExist.setCost(travelExp.getCost());
			alreadyExist.setDate(travelExp.getDate());
			alreadyExist.setDescription(travelExp.getDescription());
			alreadyExist.setTo_destination_name(travelExp.getTo_destination_name());
			alreadyExist.setFrom_destination_name(travelExp.getFrom_destination_name());
			alreadyExist.setTraveling_type(travelExp.getTraveling_type());
//			alreadyExist.set
			return travelExpRepo.save(alreadyExist);
		}
		
        throw new IllegalArgumentException(" TravelExpenses DATA NOT FOUND");
	}
	

}
