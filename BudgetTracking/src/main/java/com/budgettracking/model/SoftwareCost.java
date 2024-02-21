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

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class SoftwareCost {

	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sw_id;
	private String sw_name;
	private String sw_type;
	private String sw_code;
	private String sw_description;
	private Double sw_cost_perunit;
	private Double sw_totalcost;
	private Double sw_qty;
	private Date date;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userid")
	// name should match the actual column name in your database
	private User user;
}
