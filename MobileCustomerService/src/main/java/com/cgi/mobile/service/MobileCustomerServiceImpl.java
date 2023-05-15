package com.cgi.mobile.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.cgi.mobile.entity.MobileCustomer;
import com.cgi.mobile.exception.ResourceNotFoundException;
import com.cgi.mobile.repo.MobileCustomerRepository;


/**
 * @author manish.kumar16
 *
 */
@Service
public class MobileCustomerServiceImpl implements MobileCustomerService {
	private final Logger logger = LogManager.getLogger(MobileCustomerServiceImpl.class);
	@Autowired
	private MobileCustomerRepository mobileCustomerRepository;
    
	
	@Override
	public MobileCustomer saveMobileCustomers(MobileCustomer mobileCustomer) {
		logger.info("inside saveMobileCustomers method..");
		return mobileCustomerRepository.save(mobileCustomer);
	}

	@Override
	public List<MobileCustomer> getAllMobileCustomers() {
		logger.info("inside getAllMobileCustomers() method..");
		return mobileCustomerRepository.findAll();

	}

	@Override
	public MobileCustomer getMobileCustomerByEquipmentId(Long equipmentId) {
		logger.info("inside  getMobileCustomerByEquipmentId() method..");
		MobileCustomer mobileCustomer = mobileCustomerRepository.findById(equipmentId).orElseThrow(
				() -> new ResourceNotFoundException("equipment with given id does not exist !! :" + equipmentId));
		return mobileCustomer;
	}

	
	@Override
	public List<MobileCustomer> getMobileCustomersByAccountNumber(String accountNumber) {
		logger.info("inside  getMobileCustomersByAccountNumber(String accountNumber) method..");
		try {
			List<MobileCustomer> mobileCustomers = mobileCustomerRepository.findAllByAccountNumber(accountNumber);
			logger.info(" getMobileCustomersByAccountNumber(String accountNumber) method completed sucessfully ");
			return mobileCustomers;
			
		} catch (Exception e) {
			logger.error(e.getMessage());
			logger.debug(Arrays.toString(e.getStackTrace()));
			return null;
		}

	}

}
