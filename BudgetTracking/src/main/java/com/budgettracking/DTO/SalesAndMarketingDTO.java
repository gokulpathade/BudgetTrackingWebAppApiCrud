package com.budgettracking.DTO;

import java.util.Date;

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
public class SalesAndMarketingDTO {

	
	private String sm_type;
	private String sm_place;
	
	private Date sm_date;
	private Double sm_cost;
	private String sm_description;
//	private Double sm_total_cost;
	
}
