package com.virtusa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.integrate.ConnectionManager;
import com.virtusa.model.BatchDetailsModel;
import com.virtusa.model.VenueDetailsModel;

public class VenueDAOImpl implements VenueDAO {

@Override
	public List<VenueDetailsModel> getVenueDetails() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Connection connection=ConnectionManager.openConnection();
		Statement statement=connection.createStatement();
		
		ResultSet resultSet=
				statement.executeQuery("select vn.venue_id,vn.venue_name,vn.venue_capacity,vn.venue_location,bt.batch_name from venue vn left join batch bt ON vn.venue_id=bt.batch_id");
		List<VenueDetailsModel> venuedetailsList=new ArrayList<>();
		//System.out.println(resultSet);
		while(resultSet.next()) {
		VenueDetailsModel venueDetails=new VenueDetailsModel();
		venueDetails.setVenueId(resultSet.getString("venue_id"));
		venueDetails.setVenueName(resultSet.getString("venue_name"));
		venueDetails.setVenueCapacity(resultSet.getString("venue_capacity"));
		venueDetails.setVenueLocation(resultSet.getString("venue_location"));
		venueDetails.setBatchName(resultSet.getString("batch_name"));
		venuedetailsList.add(venueDetails);
	
		}
	ConnectionManager.closeConnection();
	return venuedetailsList;
		
	}

	@Override
	public List<BatchDetailsModel> getBatchDetails() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection=ConnectionManager.openConnection();
		Statement statement=connection.createStatement();
		
		ResultSet resultSet=
				statement.executeQuery("select batch_name,batch_id  from batch where batch_venue_id is NULL");
	List<BatchDetailsModel> batchdetailsList=new ArrayList<>();
		
		while(resultSet.next()) {
			BatchDetailsModel batchDetails=new BatchDetailsModel();
			batchDetails.setBatchName(resultSet.getString("batch_name"));
			batchDetails.setBatchId(resultSet.getString("batch_id"));
			batchdetailsList.add(batchDetails);
		}
		
		ConnectionManager.closeConnection();
		return batchdetailsList;
	}

	@Override
	public int getUpdatedVenueDetails(String venueId, String batchId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
Connection connection=ConnectionManager.openConnection();
		
		PreparedStatement statement=connection.prepareStatement("update batch set batch_venue_id = ? where batch_id = ?");

		statement.setString(1,venueId);
		statement.setString(2,batchId);
		
		int rows=statement.executeUpdate();
		ConnectionManager.closeConnection();

		return rows;
		
	}

}
