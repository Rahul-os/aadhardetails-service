package com.deloitte.aadhardetails.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "aadhardetails")
public class AadharDetails { 
	@Id
	@Column(length = 12)
	private String aadharcardNumber;
	@Column(length = 30)
	private String firstName;
	@Column(length = 20)
	private String lastName;
	@Column
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern ="dd-MM-yyyy")
	private Date dob;
	public String getAadharcardNumber() {
		return aadharcardNumber;
	}
	public void setAadharcardNumber(String aadharcardNumber) {
		this.aadharcardNumber = aadharcardNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "AadharDetails [aadharcardNumber=" + aadharcardNumber + ", firstName=" + firstName + ", lastName="
				+ lastName + ", dob=" + dob + "]";
	}
	
}