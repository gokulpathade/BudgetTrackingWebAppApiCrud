package com.budgettracking.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.budgettracking.model.TravelExpenses;

@Repository
public interface TravelExpensesRepository extends JpaRepository<TravelExpenses, Integer>{

	
	
	/*
	 * FIND DATA USING DATE 
	 * 
	 */
		@Query(value = "SELECT * FROM financial_target WHERE date BETWEEN ?1 AND ?2", nativeQuery = true)
		public List<TravelExpenses> findFinancialTargetDate(Date startDate, Date endDate);

}
