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
public class OfficeExpensesDTO {
	 private String itemname;
	    private String itemtype;
	    private String itemdescription;
	    private Date date;
	    private Double item_quantity ;

	    private Double itemcost;
//	    private String 
}
