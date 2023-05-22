package com.cgi.tv.model;

import org.springframework.http.HttpStatus;

import lombok.Builder;
import lombok.Data;

/**
 * @author manish.kumar16
 *
 */
@Data
@Builder
public class ApiResponse {
	private String message;
	private boolean success;
	private HttpStatus httpStatus;
}
