package com.budgettracking.DTO;

import java.util.Date;

import com.budgettracking.model.TravelExpenses;
import com.budgettracking.model.User;

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
public class TravelExpensesDTO {
	private String from_destination_name;
	private String to_destination_name;
	private String traveling_type;
	private String description;
	private Double cost;
	private Date date;

}
