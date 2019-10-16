package com.virtusa.controller;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.helper.VenueFactory;
import com.virtusa.model.BatchDetailsModel;
import com.virtusa.model.VenueDetailsModel;
import com.virtusa.service.VenueService;

public class VenueDetailsController extends HttpServlet{

	private VenueService venueservice;
	String SuccessMessage = "";
	
	public VenueDetailsController() {
		
		this.venueservice = VenueFactory.createVenueService();
		
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
		case "/venuelist":
			venueDetailList(request, response);
			break;
		case "/venuebatchlist":
			batchDetailList(request, response);
			break;

		case "/updatebatch":
			
			updatebatchAssign(request, response);
			break;
		default:

			venueDetailList(request, response);
			break;
		}
	}

	private void batchDetailList(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<BatchDetailsModel> batchdetailslist = new ArrayList<BatchDetailsModel>();
		List<VenueDetailsModel> venuedetailslist = new ArrayList<VenueDetailsModel>();

		venuedetailslist = venueservice.getVenueDetails();
		batchdetailslist = venueservice.getBatchDetails();
		

		request.setAttribute("batchdetailsList", batchdetailslist);
		request.setAttribute("venuedetailsList", venuedetailslist);
		RequestDispatcher dispatcher = request.getRequestDispatcher("venueindex.jsp");
		dispatcher.forward(request, response);
	}

	private void venueDetailList(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<VenueDetailsModel> venuedetailslist = new ArrayList<VenueDetailsModel>();

		venuedetailslist = venueservice.getVenueDetails();
	

		request.setAttribute("venuedetailsList", venuedetailslist);
		RequestDispatcher dispatcher = request.getRequestDispatcher("venueindex.jsp");
		dispatcher.forward(request, response);

	}

	private void updatebatchAssign(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int rowsupdated=0;
		try {
			String venueId = request.getParameter("venueId");
			String batchId = request.getParameter("batchId");
			
System.out.println(venueId);
			rowsupdated = venueservice.updatedVenuedetails(venueId, batchId);

		} catch (Exception e) {
			e.printStackTrace();
		}
		if (rowsupdated > 0)
            SuccessMessage = "Batch Added Successfully";
        else
            SuccessMessage = "Batch Assigning Failed";

 

        request.setAttribute("SuccessMessage", SuccessMessage);
        response.sendRedirect("/Venue/venuelist");

	}

}

	

