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
public class HardwareCostDTO {
	
	private int hw_id;
	private String hw_name;
	private String hw_code;
	private String hw_description;
	private Double hw_per_unit_cost;
	private Double hw_qty;
	private Double total_cost;
	private Date date;

}
