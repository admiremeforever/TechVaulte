package com.cgi.mobile.exception;

/**
 * @author manish.kumar16
 *
 */
public class ResourceNotFoundException extends RuntimeException {
	
	public ResourceNotFoundException() {
		super("Resource not found in database !!");
	}

	public ResourceNotFoundException(String message) {
		super(message);
	}

}