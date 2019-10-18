package com.virtusa.model;

import java.sql.Date;
import java.time.LocalDate;

public class ViewBatchDetailsModel {

	private String batchId;
	private String batchName;
	private String batchCapacity;
	private String batchMentorId;
	private String batchVenueId;
	private Date batchStartDate;
	private Date batchEndDate;
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public String getBatchCapacity() {
		return batchCapacity;
	}
	public void setBatchCapacity(String batchCapacity) {
		this.batchCapacity = batchCapacity;
	}
	public String getBatchMentorId() {
		return batchMentorId;
	}
	public void setBatchMentorId(String batchMentorId) {
		this.batchMentorId = batchMentorId;
	}
	public String getBatchVenueId() {
		return batchVenueId;
	}
	public void setBatchVenueId(String batchVenueId) {
		this.batchVenueId = batchVenueId;
	}
	public Date getBatchStartDate() {
		return batchStartDate;
	}
	public void setBatchStartDate(Date batchStartdate) {
		this.batchStartDate = batchStartdate;
	}
	public Date getBatchEndDate() {
		return batchEndDate;
	}
	public void setBatchEndDate(Date batchEndDate) {
		this.batchEndDate = batchEndDate;
	}
	
	
	
}
