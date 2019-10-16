package com.virtusa.service;

import java.util.ArrayList;
import java.util.List;

import com.virtusa.dao.VenueDAO;
import com.virtusa.helper.VenueFactory;
import com.virtusa.model.BatchDetailsModel;
import com.virtusa.model.VenueDetailsModel;

public class VenueServiceImpl implements VenueService {
	
	private VenueDAO venueDAO;

	public VenueServiceImpl() {
		this.venueDAO = VenueFactory.createVenueDAO();
	}

	@Override
	public List<VenueDetailsModel> getVenueDetails() {
		// TODO Auto-generated method stub
		List<VenueDetailsModel> venueDetailsModellist = new ArrayList<VenueDetailsModel>();

		try {
			venueDetailsModellist = venueDAO.getVenueDetails();

		} catch (Exception e) {
			e.printStackTrace();
		}
System.out.println(venueDetailsModellist);
		return venueDetailsModellist;
		
	}

	@Override
	public List<BatchDetailsModel> getBatchDetails() {
		// TODO Auto-generated method stub
		
List<BatchDetailsModel> batchDetailsModelList=new ArrayList<BatchDetailsModel>();
		
		try {
			batchDetailsModelList=venueDAO.getBatchDetails();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return batchDetailsModelList;

		
	}

	@Override
	public int updatedVenuedetails(String venueId, String batchId) {
		// TODO Auto-generated method stub
		
		int rowsupdated = 0;
		try {
			rowsupdated = venueDAO.getUpdatedVenueDetails(venueId, batchId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowsupdated;
	
	}

}
