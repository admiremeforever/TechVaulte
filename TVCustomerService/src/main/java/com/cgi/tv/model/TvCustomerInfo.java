package com.cgi.tv.model;

import com.cgi.tv.entity.TVCustomer;

import lombok.Data;


/**
 * @author manish.kumar16
 *
 */
@Data

public class TvCustomerInfo {

	private String accountNumber;
	private String equipmentStatus;
	private String equipment;
	private String model;
	private String services;
	private String channels;

	public TvCustomerInfo(TVCustomer tvCustomer) {
		super();
		this.accountNumber = tvCustomer.getAccountNumber();
		this.equipmentStatus = tvCustomer.getEquipmentStatus();
		this.equipment = tvCustomer.getEquipment();
		this.model = tvCustomer.getModel();
		this.services = tvCustomer.getServices();
		this.channels = tvCustomer.getChannels();
	}
}