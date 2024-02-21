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
public class HardwareCost {

	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hw_id;
	private String hw_name;
	private String hw_code;
	private String hw_description;
	private Double hw_per_unit_cost;
	private Double hw_qty;
	private Double total_cost;
	private Date date;

	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userid")
	// name should match the actual column name in your database
	private User user;
	
	
 	
}
