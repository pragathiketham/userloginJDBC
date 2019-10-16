package com.virtusa.model;

public class VenueDetailsModel {

	private String venueId;
	private String venueName;
	private String venueCapacity;
	private String venueLocation;
	private String batchName;
	
	
	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public String getVenueId() {
		return venueId;
	}

	public void setVenueId(String venueId) {
		this.venueId = venueId;
	}

	public String getVenueName() {
		return venueName;
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public String getVenueCapacity() {
		return venueCapacity;
	}

	public void setVenueCapacity(String venueCapacity) {
		this.venueCapacity = venueCapacity;
	}

	public String getVenueLocation() {
		return venueLocation;
	}

	public void setVenueLocation(String venueLocation) {
		this.venueLocation = venueLocation;
	}
}
