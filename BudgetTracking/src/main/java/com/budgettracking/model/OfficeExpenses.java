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
public class OfficeExpenses {

	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int officeitemid;
    private String itemname;
    private String itemtype;
    private String itemdescription;
    private Date date;
    private Double item_quantity ;

    private Double itemcost;
//    private String 
    
    
    @ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userid")
	// name should match the actual column name in your database
	private User user;
}
