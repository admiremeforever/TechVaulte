package com.cgi.mobile.controller;

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

import com.cgi.mobile.MobileCustomerServiceApplication;
import com.cgi.mobile.entity.MobileCustomer;
import com.cgi.mobile.service.MobileCustomerService;

/**
 * @author manish.kumar16
 *
 */
@RestController
@RequestMapping("/mobilecustomers")
public class MobileServiceController {
	private static final Logger logger = LogManager.getLogger(MobileServiceController.class);
	@Autowired
	private MobileCustomerService mobileCustomerService;

	/**
	 * This method will save the MobileCustomer in Mobile_Customers table by calling
	 * the saveMobileCustomers service 
	 * 
	 * @param mobileCustomer
	 * @return ResponseEntity<MobileCustomer>
	 */
	@PostMapping
	public ResponseEntity<MobileCustomer> createMobileCustomer(@RequestBody MobileCustomer mobileCustomer) {
		logger.info("inside createMobileCustomer method ...");
		MobileCustomer m = mobileCustomerService.saveMobileCustomers(mobileCustomer);
		return ResponseEntity.status(HttpStatus.CREATED).body(m);
	}
	/**
	 * This method will retrieve all the MobileCustomer present in  Mobile_Customers table by calling
	 * the getAllMobileCustomers() service 
	 * 
	 * @param 
	 * @return ResponseEntity<List<MobileCustomer>>
	 */
	@GetMapping
	public ResponseEntity<List<MobileCustomer>> getAllMobileCustomer() {
		logger.info("inside getAllMobileCustomer() method ...");
		List<MobileCustomer> allMobileCustomer = mobileCustomerService.getAllMobileCustomers();
		return ResponseEntity.ok(allMobileCustomer);
	}

	/**
	 * This method will retrieve a MobileCustomer with given Id present in  Mobile_Customers table by calling
	 * the getMobileCustomerByEquipmentId(equipmentId) service 
	 * 
	 * @param  Long equipmentId
	 * @return ResponseEntity<MobileCustomer>
	 */
	@GetMapping("/{equipmentId}")
	public ResponseEntity<MobileCustomer> getMobileCustomerById(@PathVariable Long equipmentId) {
		logger.info("inside getMobileCustomerByAccountNumber method ...");
		MobileCustomer m = mobileCustomerService.getMobileCustomerByEquipmentId(equipmentId);
		return ResponseEntity.ok(m);
	}
	/**
	 * This method will retrieve all the  MobileCustomer with given accountNumber  present in  Mobile_Customers table by calling
	 * the getMobileCustomersByAccountNumber(accountNumber) service 
	 * 
	 * @param  String accountNumber
	 * @return ResponseEntity<List<MobileCustomer>>
	 */
	@GetMapping("/getByAccount/{accountNumber}")
	public ResponseEntity<List<MobileCustomer>> getMobileCustomerByAccountNumber(@PathVariable String accountNumber) {
		logger.info("inside getMobileCustomerByAccountNumber method ...");
		List<MobileCustomer> mobileCustomers = mobileCustomerService.getMobileCustomersByAccountNumber(accountNumber);
		return ResponseEntity.ok(mobileCustomers);

	}

}
