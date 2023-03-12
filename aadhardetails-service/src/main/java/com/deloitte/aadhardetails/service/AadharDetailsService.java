package com.deloitte.aadhardetails.service;

import java.util.List;
import java.util.Optional;

import com.deloitte.aadhardetails.entity.AadharDetails;

public interface AadharDetailsService { 
	
	void addAadharDetails(AadharDetails details);
	
	List<AadharDetails> findAll(); 
	
	Optional<AadharDetails> findDetailsByNumber(String aadharno);  //aadharnumber
	
	

}
