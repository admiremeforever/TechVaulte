package com.cgi.tv.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cgi.tv.entity.TVCustomer;
import com.cgi.tv.model.CustomerProfile;
import com.cgi.tv.service.CustomerProfileService;
import com.cgi.tv.service.TVCustomerService;

/**
 * @author manish.kumar16
 *
 */
@RestController
@RequestMapping("/tvcustomers")
public class TVCustomerController {

	private static final Logger logger = LogManager.getLogger(TVCustomerController.class);
	@Autowired
	private TVCustomerService tvCustomerService;
	@Autowired
	private CustomerProfileService customerProfileService;

	/**
	 * This method will save the TVCustomers in TV_Customers table by calling the
	 * saveTVCustomers service
	 * 
	 * @param TVCustomer tvCustomer
	 * @return ResponseEntity<TVCustomer>
	 */
	@PostMapping
	public ResponseEntity<TVCustomer> createTVCustomer(@RequestBody TVCustomer tvCustomer) {
		logger.info("inside createTVCustomer(@RequestBody TVCustomer tvCustomer) method ....");
		TVCustomer tvc = tvCustomerService.saveTVCustomers(tvCustomer);
		return ResponseEntity.status(HttpStatus.CREATED).body(tvc);
	}

	/**
	 * This method will retrieve a TVCustomer with given accountNumber present in
	 * TV_Customers table by calling the getTVCustomer(accountNumber) service method
	 * 
	 * @param String accountNumber
	 * @return ResponseEntity<TVCustomer>
	 */

	@GetMapping("/{accountNumber}")
	public ResponseEntity<TVCustomer> getSingleTVCustomer(@PathVariable String accountNumber) {
		logger.info("inside getSingleTVCustomer(@PathVariable String accountNumber) method ....");
		TVCustomer tvc = tvCustomerService.getTVCustomer(accountNumber);
		return ResponseEntity.status(HttpStatus.OK).body(tvc);
	}

	/**
	 * This method will retrieve all the TvCustomer present in TV_Customers table by
	 * calling the getAllTVCustomers() service method
	 * 
	 * @param
	 * @return ResponseEntity<List<TVCustomer>>
	 */

	@GetMapping
	public ResponseEntity<List<TVCustomer>> getAllTVCustomer() {
		logger.info("inside getAllTVCustomer() method ....");
		List<TVCustomer> allTVC = tvCustomerService.getAllTVCustomers();
		return ResponseEntity.status(HttpStatus.OK).body(allTVC);
	}

	/**
	 * This method will fetch the CustomerProfile of a customer (with all the mobile
	 * and Tv's details associated with the given account number ) by calling the
	 * getCustomerProfileInfo(accountNumber) service
	 * 
	 * @param String accountNumber
	 * @return ResponseEntity<CustomerProfile>
	 */
	@GetMapping("/getCustomerInfo/{accountNumber}")
	public ResponseEntity<CustomerProfile> getCustomerInfo(@PathVariable String accountNumber) {
		logger.info("inside getCustomerInfo(@PathVariable String accountNumber) method ....");
		CustomerProfile customerProfile = customerProfileService.getCustomerProfileInfo(accountNumber);
		return ResponseEntity.status(HttpStatus.OK).body(customerProfile);
	}

}
