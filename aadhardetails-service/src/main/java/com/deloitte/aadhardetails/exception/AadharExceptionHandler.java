package com.deloitte.aadhardetails.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AadharExceptionHandler { 
	@ExceptionHandler(value = AadharNotFoundException.class)
	//If given aadhar no is not present
	public ResponseEntity<Object> exception(AadharNotFoundException exc)
	{
		return new ResponseEntity<Object>("Aadhar not found!!",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = AadharDetailsNotAvailableException.class)
	//if addhardetails is empty
	public ResponseEntity<Object> exception(AadharDetailsNotAvailableException exc)
	{
		return new ResponseEntity<Object>("Aadhar details are not avialable!!",HttpStatus.NOT_FOUND);
	}

}
