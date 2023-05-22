package com.cgi.tv.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cgi.tv.controller.TVCustomerController;
import com.cgi.tv.entity.TVCustomer;
import com.cgi.tv.exceptions.ResourceNotFoundException;
import com.cgi.tv.model.MobileCustomer;
import com.cgi.tv.model.MobileCustomerInfo;
import com.cgi.tv.repo.TVCustomerRepository;

/**
 * @author manish.kumar16
 *
 */
@Service
public class TVCustomerServiceImpl implements TVCustomerService {
	private static final Logger logger = LogManager.getLogger(TVCustomerServiceImpl.class);
	@Autowired
	private TVCustomerRepository tvCustomerRepository;

	@Override
	public TVCustomer saveTVCustomers(TVCustomer tvc) {
		logger.info("saveTVCustomers(TVCustomer tvc) service called ");
		TVCustomer tVCustomer = tvCustomerRepository.save(tvc);
		logger.info("saveTVCustomers(TVCustomer tvc) service completed sucessfully... ");
		return tVCustomer;

	}

	@Override
	public List<TVCustomer> getAllTVCustomers() {
		logger.info("getAllTVCustomers() service called ");
		return tvCustomerRepository.findAll();
	}

	@Override
	public TVCustomer getTVCustomer(String accountNumber) {
		logger.info("getTVCustomer(String accountNumber) service called ");
		TVCustomer tVCustomer = tvCustomerRepository.findById(accountNumber)
				.orElseThrow(() -> new ResourceNotFoundException(
						"TVCustomer with given accountNumber Does not Exist  !! :" + accountNumber));
		return tVCustomer;
	}

}
