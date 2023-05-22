package com.cgi.tv.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author manish.kumar16
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MobileCustomer {

	private Long equipmentId;
	private String accountNumber;
	private String firstName;
	private String lastName;
	private String address;
	private String status;
	private String model;
	private String services;
	private Date purchseDate;
	private String plan;
}

