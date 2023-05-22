package com.cgi.tv.service;

import java.util.List;

import com.cgi.tv.entity.TVCustomer;

/**
 * @author manish.kumar16
 *
 */
public interface TVCustomerService {

	/**
	 * This method will save the TVCustomers in TV_Customers table
	 * 
	 * @param TVCustomer tvCustomer
	 * @return TVCustomer
	 */
	TVCustomer saveTVCustomers(TVCustomer tvc);

	/**
	 * This method will retrieve all the TvCustomer present in TV_Customers table by
	 * calling the getAllTVCustomers() service method
	 * 
	 * @param
	 * @return List<TVCustomer
	 */
	List<TVCustomer> getAllTVCustomers();

	/**
	 * This method will retrieve a TVCustomer with given accountNumber present in
	 * TV_Customers table
	 * 
	 * @param String accountNumber
	 * @return TVCustomer
	 */
	TVCustomer getTVCustomer(String accountNumber);

}
