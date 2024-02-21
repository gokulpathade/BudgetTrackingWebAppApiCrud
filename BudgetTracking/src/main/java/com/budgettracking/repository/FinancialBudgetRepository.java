package com.budgettracking.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.budgettracking.model.FinancialBudget;

@Repository
public interface FinancialBudgetRepository extends JpaRepository<FinancialBudget, Integer> {

	
	
	
	/*
	 * FIND DATA USING DATE 
	 * 
	 */
		@Query(value = "SELECT * FROM financial_budget WHERE date BETWEEN ?1 AND ?2", nativeQuery = true)
		public List<FinancialBudget> findFinancialBudgetDate(Date startDate, Date endDate);

}
