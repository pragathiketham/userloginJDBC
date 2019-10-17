package com.virtusa.service;

import java.util.ArrayList;
import java.util.List;

import com.virtusa.dao.MentorDAO;
import com.virtusa.helper.FactoryDB;
import com.virtusa.model.BatchDetailsModel;
import com.virtusa.model.MentorDetailsModel;

public class MentorServiceImpl implements MentorService {

	private MentorDAO mentorDAO;

	public MentorServiceImpl() {
		this.mentorDAO = FactoryDB.createMentorDAO();

	}

	@Override
	public List<MentorDetailsModel> getMentorDetails() {

		List<MentorDetailsModel> mentorDetailsModellist = new ArrayList<MentorDetailsModel>();

		try {
			mentorDetailsModellist = mentorDAO.getMentorDetails();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return mentorDetailsModellist;
	}

	@Override
	public List<BatchDetailsModel> getBatchDetails() {

		List<BatchDetailsModel> batchDetailsModellist = new ArrayList<BatchDetailsModel>();

		try {
			batchDetailsModellist = mentorDAO.getBatchDetails();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return batchDetailsModellist;

	}

	@Override
	public int updatedmentordetails(String mentorid, String batchid) {
		int rowsupdated = 0;
		try {
			rowsupdated = mentorDAO.getUpdatedMentorDetails(mentorid, batchid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowsupdated;
	}

}
