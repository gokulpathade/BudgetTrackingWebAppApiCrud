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
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class TravelExpenses {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int travelid;
	private String from_destination_name;
	private String to_destination_name;
	private String traveling_type;
	private String description;
	private Double cost;
	private Date date;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userid")
	// name should match the actual column name in your database
	private User user;
}
