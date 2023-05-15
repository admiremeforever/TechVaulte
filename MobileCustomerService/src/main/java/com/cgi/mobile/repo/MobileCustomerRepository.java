package com.cgi.mobile.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cgi.mobile.entity.MobileCustomer;

/**
 * @author manish.kumar16
 *
 */
public interface MobileCustomerRepository extends JpaRepository<MobileCustomer, Long> {

	/**
	 * This method will retrieve all the MobileCustomer with given accountNumber
	 * present in Mobile_Customers table
	 * 
	 * @param accountNumber
	 * @return List<MobileCustomer>
	 */
	List<MobileCustomer> findAllByAccountNumber(String accountNumber);

}
