package com.virtusa.model;

import java.util.Date;

public class LpDetailsModel {

	  private String lpid;
	    private String firstname;
	    private String lastname;
	    private String phonenumber;
	    private Date Dob;
	    private String email;
	    private String designation;
	    private String city;
	    private String state;
	    private String country;
	    public String getLpid() {
	        return lpid;
	    }
	    public void setLpid(String lpid) {
	        this.lpid = lpid;
	    }
	    public Date getDob() {
	        return Dob;
	    }
	    public void setDob(Date dob) {
	        Dob = dob;
	    }
	    public String getCity() {
	        return city;
	    }
	    public void setCity(String city) {
	        this.city = city;
	    }
	    public String getState() {
	        return state;
	    }
	    public void setState(String state) {
	        this.state = state;
	    }
	    public String getCountry() {
	        return country;
	    }
	    public void setCountry(String country) {
	        this.country = country;
	    }
	    public String getFirstname() {
	        return firstname;
	    }
	    public void setFirstname(String firstname) {
	        this.firstname = firstname;
	    }
	    public String getLastname() {
	        return lastname;
	    }
	    public void setLastname(String lastname) {
	        this.lastname = lastname;
	    }
	    public String getPhonenumber() {
	        return phonenumber;
	    }
	    public void setPhonenumber(String phonenumber) {
	        this.phonenumber = phonenumber;
	    }
	    public String getEmail() {
	        return email;
	    }
	    public void setEmail(String email) {
	        this.email = email;
	    }
	    public String getDesignation() {
	        return designation;
	    }
	    public void setDesignation(String designation) {
	        this.designation = designation;
	    }
}
