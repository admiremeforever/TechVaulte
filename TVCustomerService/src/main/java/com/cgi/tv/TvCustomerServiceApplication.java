package com.cgi.tv;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author manish.kumar16
 *
 */
@SpringBootApplication
public class TvCustomerServiceApplication {
	private static final Logger logger = LogManager.getLogger(TvCustomerServiceApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(TvCustomerServiceApplication.class, args);
		logger.info(" >>>>>>>>>>>>>>>>>>> POC02(MS-2) TVCUSTOMER-SERVICE Springboot application - Started Successfully >>>>>>>>>>>>>>>>> ");
	}

}
