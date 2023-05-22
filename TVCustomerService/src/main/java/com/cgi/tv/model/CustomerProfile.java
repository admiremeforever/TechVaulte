package com.cgi.tv.model;

import java.util.List;

import com.cgi.tv.entity.TVCustomer;

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
public class CustomerProfile {
	private String accountNumber;
	private String firstName;
	private String lastName;
	private String accountStatus = "Active";
	private String address;
	private String version = "1.0.0";
	private String accountTerminationDate = "NA";
	private TvCustomerInfo tvCustomerInfo;
	private List<MobileCustomerInfo> mobileCustomerInfos;

}
