package com.deloitte.aadhardetails.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.aadhardetails.entity.AadharDetails;
import com.deloitte.aadhardetails.service.AadharDetailsService;

@RestController
@RequestMapping("/aadhardetails")
public class AadharDetailsController {

	@Autowired 
	AadharDetailsService service;
	
	@PostMapping 
	public ResponseEntity<String> addAadharDetails(@RequestBody AadharDetails details){
		
		service.addAadharDetails(details);
		return new ResponseEntity<String>("aadhar details added",HttpStatus.OK);
	}
	
	@GetMapping 
	public ResponseEntity<List<AadharDetails>> getAllDetails(){
		
		List<AadharDetails> allAadharDetails = service.findAll();
		return new ResponseEntity<List<AadharDetails>>(allAadharDetails,HttpStatus.OK);
	} 
	
	@GetMapping("/{aadharno}")
	public ResponseEntity <Optional<AadharDetails>> findDetailsByNumber(@PathVariable("aadharno") String aadharno){
		Optional<AadharDetails> details = service.findDetailsByNumber(aadharno);
		return new ResponseEntity <Optional<AadharDetails>>(details,HttpStatus.OK);
	}
}
