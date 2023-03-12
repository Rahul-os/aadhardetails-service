package com.deloitte.aadhardetails.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.deloitte.aadhardetails.entity.AadharDetails;


@Repository
public interface AadharDetailsRepository extends JpaRepository<AadharDetails, String> {
	
	@Query(value ="select aadhar from AadharDetails aadhar where aadhar.aadharcardNumber=?1")
	Optional<AadharDetails> findDetailsByNumber(String aadharno);

}
