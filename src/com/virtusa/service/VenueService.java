package com.virtusa.service;

import java.util.List;

import com.virtusa.model.BatchDetailsModel;
import com.virtusa.model.VenueDetailsModel;

public interface VenueService {

	public List<VenueDetailsModel> getVenueDetails();
	public List<BatchDetailsModel>  getBatchDetails();

	public int updatedVenuedetails(String venueId, String batchId);
}
