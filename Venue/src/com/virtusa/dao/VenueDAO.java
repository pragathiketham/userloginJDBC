package com.virtusa.dao;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.model.BatchDetailsModel;
import com.virtusa.model.VenueDetailsModel;

public interface VenueDAO {

	public List<VenueDetailsModel> getVenueDetails() throws ClassNotFoundException, SQLException;
	public List<BatchDetailsModel> getBatchDetails() throws ClassNotFoundException, SQLException; 
	public int getUpdatedVenueDetails(String venueId, String batchId) throws ClassNotFoundException, SQLException;
}
