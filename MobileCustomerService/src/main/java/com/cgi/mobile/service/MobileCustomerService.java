package com.cgi.mobile.service;

import java.util.List;

import com.cgi.mobile.entity.MobileCustomer;

/**
 * @author manish.kumar16
 *
 */
public interface MobileCustomerService {

	/**
	 * This method will save the MobileCustomer in Mobile_Customers table by calling
	 * 
	 * @param MobileCustomer
	 * @return MobileCustomer
	 */
	MobileCustomer saveMobileCustomers(MobileCustomer mobilecustomer);

	/**
	 * This method will retrieve all the MobileCustomer present in Mobile_Customers
	 * table
	 * 
	 * @param
	 * @return List<MobileCustomer>
	 */
	List<MobileCustomer> getAllMobileCustomers();

	/**
	 * This method will retrieve a MobileCustomer with given Id present in
	 * Mobile_Customers table
	 * 
	 * @param Long equipmentId
	 * @return MobileCustomer
	 */
	MobileCustomer getMobileCustomerByEquipmentId(Long equipmentId);

	/**
	 * This method will retrieve all the MobileCustomer with given accountNumber
	 * present in Mobile_Customers table
	 *  
	 * @param  String accountNumber
	 * @return List<MobileCustomer>
	 */
	List<MobileCustomer> getMobileCustomersByAccountNumber(String accountNumber);

}
