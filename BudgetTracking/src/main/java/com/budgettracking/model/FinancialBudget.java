package com.budgettracking.model;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table
public class FinancialBudget {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ftid;
	private Date date;

	private Double q1;
	private Double q2;
	private Double q3;
	private Double q4;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userid")
	// name should match the actual column name in your database
	private User user;
	
}
