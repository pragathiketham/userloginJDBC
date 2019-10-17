package com.virtusa.model;

public class MentorDetailsModel {

	private String name;
	private String mentorid;
	private String email;
	private int phonenumber;
	private String batchname;
	public String getName() {
		return name;
	}
	
	public String getMentorid() {
		return mentorid;
	}

	public void setMentorid(String mentorid) {
		this.mentorid = mentorid;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getBatchname() {
		return batchname;
	}
	public void setBatchname(String batchname) {
		this.batchname = batchname;
	}
	
	
}
