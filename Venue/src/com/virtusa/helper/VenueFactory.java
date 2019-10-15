package com.virtusa.helper;

import com.virtusa.dao.VenueDAO;
import com.virtusa.dao.VenueDAOImpl;
import com.virtusa.service.VenueService;
import com.virtusa.service.VenueServiceImpl;

public class VenueFactory {

	public static VenueDAO createVenueDAO(){
		VenueDAO venueDAO=new VenueDAOImpl();
		return venueDAO;
	}
	
	public static VenueService createVenueService(){
		VenueService venueService=new VenueServiceImpl();
		return venueService;
		
		}

}
