package com.virtusa.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.helper.FactoryDB;
import com.virtusa.model.BatchDetailsModel;
import com.virtusa.model.MentorDetailsModel;
import com.virtusa.service.MentorService;

public class MentorDetailsController extends HttpServlet {

	private MentorService mentorservice;
	String SuccessMessage = "";

	public MentorDetailsController() {
		this.mentorservice = FactoryDB.createMentorService();
	}

	public void init() {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		switch (action) {
		case "/mentorlist":
			mentorDetailList(request, response);
			break;
		case "/batchlist":
			batchDetailList(request, response);
			break;

		case "/updatebatch":
			
			updatebatchAssign(request, response);
			break;
		default:

			mentorDetailList(request, response);
			break;
		}
	}

	private void batchDetailList(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<BatchDetailsModel> batchdetailslist = new ArrayList<BatchDetailsModel>();
		List<MentorDetailsModel> mentordetailslist = new ArrayList<MentorDetailsModel>();

		mentordetailslist = mentorservice.getMentorDetails();
		batchdetailslist = mentorservice.getBatchDetails();
		System.out.println(batchdetailslist.get(0).getBatchName());

		request.setAttribute("batchdetailsList", batchdetailslist);
		request.setAttribute("mentordetailsList", mentordetailslist);
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}

	private void mentorDetailList(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<MentorDetailsModel> mentordetailslist = new ArrayList<MentorDetailsModel>();

		mentordetailslist = mentorservice.getMentorDetails();
		System.out.println(mentordetailslist.get(0).getName());

		request.setAttribute("mentordetailsList", mentordetailslist);
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);

	}

	private void updatebatchAssign(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int rowsupdated = 0;
		try {
			String mentroId = request.getParameter("mentorid");
			String batchId = request.getParameter("batchid");
			System.out.println(mentroId+"  "+ batchId);

			rowsupdated = mentorservice.updatedmentordetails(mentroId, batchId);

		} catch (Exception e) {
			e.printStackTrace();
		}
		if (rowsupdated > 0)
			SuccessMessage = "Batch Added Successfully";
		else
			SuccessMessage = "Batch Assigning Failed";

		request.setAttribute("SuccessMessage", SuccessMessage);
		response.sendRedirect("/MentorDetails/mentorlist");
		//RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		//dispatcher.forward(request, response);

	}

}
