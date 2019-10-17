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
import com.virtusa.model.MentorDetailsModel;

public class MentorDAOImpl implements MentorDAO {

	@Override
	public List<MentorDetailsModel> getMentorDetails() throws SQLException, ClassNotFoundException {
		Connection connection=ConnectionManager.openConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet=
				statement.executeQuery("select md.mentor_id, md.name, md.phone_number, md.email,bt.batch_name from mentordetails md left join batch bt  ON  md.mentor_id = bt.batch_mentor_id");
		
		List<MentorDetailsModel> mentordetailsList=new ArrayList<>();
		System.out.println(resultSet.getFetchSize()+"   resultset size");
		while(resultSet.next()) {
			MentorDetailsModel mentorDetails=new MentorDetailsModel();
			mentorDetails.setMentorid(resultSet.getString("mentor_id"));
			mentorDetails.setName(resultSet.getString("name"));
			mentorDetails.setEmail(resultSet.getString("email"));
			mentorDetails.setPhonenumber(resultSet.getInt("phone_number"));
			mentorDetails.setBatchname(resultSet.getString("batch_name"));
			mentordetailsList.add(mentorDetails);
		}
		
		ConnectionManager.closeConnection();
		return mentordetailsList;
	}

	@Override
	public List<BatchDetailsModel> getBatchDetails() throws ClassNotFoundException, SQLException {
		Connection connection=ConnectionManager.openConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet=
				statement.executeQuery("select batch_name,batch_id  from batch where batch_mentor_id is NULL");
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
	public int getUpdatedMentorDetails(String mentorid,String batchid) throws ClassNotFoundException, SQLException {
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=connection.prepareStatement("update batch set batch_mentor_id = ? where batch_id = ?");

		statement.setString(1,mentorid);
		statement.setString(2,batchid);

		int rows=statement.executeUpdate();
		ConnectionManager.closeConnection();
		
		return rows;
	}

}
