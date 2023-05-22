package com.cgi.tv.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author manish.kumar16
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MobileCustomerInfo {

	//private String accountNumber;
	private Long equipmentId;
	private String status;
	private String model;
	private String services;
	private Date purchseDate;
	private String plan;

	public MobileCustomerInfo(MobileCustomer mobileCustomer) {
		super();
		//this.accountNumber = mobileCustomer.getAccountNumber();
		this.equipmentId = mobileCustomer.getEquipmentId();
		this.status = mobileCustomer.getStatus();
		this.model = mobileCustomer.getModel();
		this.services = mobileCustomer.getServices();
		this.purchseDate = mobileCustomer.getPurchseDate();
		this.plan = mobileCustomer.getPlan();
	}

}
