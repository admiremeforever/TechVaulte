package com.cgi.mobile.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Entity
@Table(name = "Mobile_Customers")
public class MobileCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EQUIPMENT_ID")
	private Long equipmentId;
	@Column(name = "ACCOUNT_NUMBER")
	private String accountNumber;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "ADDRESS")
	private String address;
	@Column(name = "STATUS")
	private String status;
	@Column(name = "MODEL")
	private String model;
	@Column(name = "SERVICES")
	private String services;
	@Column(name="PURCHASE_DATE")
	private Date purchseDate;
	@Column(name = "PLAN")
	private String plan;

}
