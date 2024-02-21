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
public class SoftwareCostDTO {
	
	private String sw_name;
	private String sw_type;
	private String sw_code;
	private String sw_description;
	private Double sw_cost_perunit;
	private Double sw_totalcost;
	private Double sw_qty;
	private Date date;

}
