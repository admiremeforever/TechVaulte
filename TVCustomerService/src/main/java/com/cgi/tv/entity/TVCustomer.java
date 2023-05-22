package com.cgi.tv.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

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
@Table(name = "TV_Customers")
public class TVCustomer {

	@Id
	@Column(name = "ACCOUNT_NUMBER")
	private String accountNumber;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "EQUIPMENT_STATUS")
	private String equipmentStatus;
	@Column(name = "ADDRESS")
	private String address;
	@Column(name = "EQUIPMENT")
	private String equipment;
	@Column(name = "MODEL")
	private String model;
	@Column(name = "SERVICES")
	private String services;
	@Column(name = "CHANNELS")
	private String channels;
	


}
