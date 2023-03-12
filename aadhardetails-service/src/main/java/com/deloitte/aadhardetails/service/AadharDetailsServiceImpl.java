package com.deloitte.aadhardetails.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.aadhardetails.entity.AadharDetails;
import com.deloitte.aadhardetails.exception.AadharDetailsNotAvailableException;
import com.deloitte.aadhardetails.exception.AadharNotFoundException;
import com.deloitte.aadhardetails.repository.AadharDetailsRepository;

@Service
public class AadharDetailsServiceImpl implements AadharDetailsService {

	@Autowired
	AadharDetailsRepository repo;
	
	@Override
	public void addAadharDetails(AadharDetails details) {
		
		repo.save(details);
		
	}

	@Override
	public List<AadharDetails> findAll() {
		
		List<AadharDetails> aadharList  = repo.findAll();
		if(aadharList.isEmpty())
			//if no aadhar cards are there in the aadhar database.
			throw new AadharDetailsNotAvailableException();
		return aadharList;
	}

	@Override
	public Optional<AadharDetails> findDetailsByNumber(String aadharno) {
		// TODO Auto-generated method stub
		Optional<AadharDetails> details = repo.findDetailsByNumber(aadharno);
		if(details.isEmpty())
			throw new AadharNotFoundException();
		return details;
	}
	
	

}
