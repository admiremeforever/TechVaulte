package com.cgi.tv.service;

import com.cgi.tv.model.CustomerProfile;

/**
 * @author manish.kumar16
 *
 */
public interface CustomerProfileService {
	/**
	 * This method will fetch the CustomerProfile of a customer (with all the mobile
	 * and Tv's details associated with the given account number ) 
	 * 
	 * @param String accountNumber
	 * @return ResponseEntity<CustomerProfile>
	 */
	CustomerProfile getCustomerProfileInfo(String accontNumber);
	
}
