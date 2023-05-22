package com.cgi.tv.exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cgi.tv.controller.TVCustomerController;
import com.cgi.tv.model.ApiResponse;

/**
 * @author manish.kumar16
 *
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
	private static final Logger logger = LogManager.getLogger(GlobalExceptionHandler.class);
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException ex) {
		logger.error("Exception occured...");
		String message = ex.getMessage();
		ApiResponse response = ApiResponse.builder().message(message).success(true).httpStatus(HttpStatus.NOT_FOUND)
				.build();
		return new ResponseEntity<ApiResponse>(response, HttpStatus.NOT_FOUND);

	}
}
