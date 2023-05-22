package com.cgi.tv.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cgi.tv.controller.TVCustomerController;
import com.cgi.tv.entity.TVCustomer;
import com.cgi.tv.exceptions.ResourceNotFoundException;
import com.cgi.tv.model.CustomerProfile;
import com.cgi.tv.model.MobileCustomer;
import com.cgi.tv.model.MobileCustomerInfo;
import com.cgi.tv.model.TvCustomerInfo;

/**
 * @author manish.kumar16
 *
 */
@Service
public class CustomerProfileServiceImpl implements CustomerProfileService {
	private static final Logger logger = LogManager.getLogger(CustomerProfileServiceImpl.class);
	@Autowired
	private TVCustomerService tvCustomerService;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public CustomerProfile getCustomerProfileInfo(String accontNumber) {
		logger.info("getCustomerProfileInfo service called....");
		TVCustomer tVCustomer = tvCustomerService.getTVCustomer(accontNumber);
		TvCustomerInfo tvCustomerInfo = new TvCustomerInfo(tVCustomer);
		CustomerProfile customerProfile = new CustomerProfile();
		customerProfile.setAccountNumber(tVCustomer.getAccountNumber());
		customerProfile.setFirstName(tVCustomer.getFirstName());
		customerProfile.setLastName(tVCustomer.getLastName());
		customerProfile.setAddress(tVCustomer.getAddress());

		customerProfile.setTvCustomerInfo(tvCustomerInfo);

		try {

			String mobileCustomerServiceApi = "http://mobilecustomer-service/mobilecustomers/getByAccount/"
					+ tVCustomer.getAccountNumber();
			logger.info("mobilecustomer-service(MS-1) API called ... ");
			MobileCustomer[] m = restTemplate.getForObject(mobileCustomerServiceApi, MobileCustomer[].class);

			List<MobileCustomer> mobileCustomers = Arrays.stream(m).toList();

			List<MobileCustomerInfo> mobileCustomerInfos = new ArrayList<>();
			for (MobileCustomer mc : mobileCustomers) {
				MobileCustomerInfo mobileCustomerInfo = new MobileCustomerInfo(mc);
				mobileCustomerInfos.add(mobileCustomerInfo);
				logger.info("getCustomerProfileInfo service completed sucessfully....");
			}
			logger.info("MOBILE-SERVICE(MS-1) API call completed sucessfully ... ");
			customerProfile.setMobileCustomerInfos(mobileCustomerInfos);
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			logger.debug(Arrays.toString(ex.getStackTrace()));
		}

		return customerProfile;

	}

}
