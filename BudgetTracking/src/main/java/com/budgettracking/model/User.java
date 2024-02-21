package com.budgettracking.model;

import java.util.List;



import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Entity
@Table
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	private String fullname;
	private String username;
	private String role; 
	private String password;
	
	
	private String address;
	private String department;
	private String designation;
    private String city;
    private String country;

//	private String customer_name;

	private String email_id;

	private String mobile_no;

	private String phone;

	private String state;

	private String zip;
	
	
	
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
////	@JoinColumn(name = "notification_id")
//	private List<UserInformation> userInformation;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//	@JoinColumn(name = "notification_id")
	private List<FinancialBudget> financialBudget;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//	@JoinColumn(name = "notification_id")
	private List<HardwareCost> hardwareCost;
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//	@JoinColumn(name = "notification_id")
	private List<SoftwareCost> softwareCost;
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//	@JoinColumn(name = "notification_id")
	private List<TravelExpenses> travelExpenses;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//	@JoinColumn(name = "notification_id")
	private List<OfficeExpenses> officeExpenses;
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//	@JoinColumn(name = "notification_id")
	private List<SalesAndMarketing> salesAndMarketing;
	
}
