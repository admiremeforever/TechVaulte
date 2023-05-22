package com.cgi.tv.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cgi.tv.entity.TVCustomer;

/**
 * @author manish.kumar16
 *
 */
public interface TVCustomerRepository extends JpaRepository<TVCustomer, String> {

}
