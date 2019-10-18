package com.virtusa.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.DAO.AdminDAO;
import com.virtusa.entities.Admin;
import com.virtusa.helper.FactoryDB;
import com.virtusa.model.LpDetailsModel;
import com.virtusa.model.UpdateAdminModel;
import com.virtusa.model.ViewBatchDetailsModel;

public class AdminServiceImpl implements AdminService {

	private AdminDAO adminDAO;
	public AdminServiceImpl() {
		this.adminDAO = FactoryDB.createAdminDAO();
	}
	@Override
	public List<ViewBatchDetailsModel> getBatchDetails() {
		// TODO Auto-generated method stub
		
List<ViewBatchDetailsModel> batchDetailsModelList=new ArrayList<>();
		
		try {
			batchDetailsModelList=adminDAO.viewBatchDetails();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return batchDetailsModelList;
	
	}
	@Override
	public List<LpDetailsModel> lpViewLpDetails() {
		// TODO Auto-generated method stub
List<LpDetailsModel> lpDetailsModelList=new ArrayList<>();
		
		try {
			lpDetailsModelList=adminDAO.lpDetailsListShow();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return lpDetailsModelList;
	}
	@Override
	public boolean storeAdminService(UpdateAdminModel updateAdminModel) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Admin admin = new Admin();
		admin.setFirstName(updateAdminModel.getFirstName());
		admin.setLastName(updateAdminModel.getLastName());
		admin.setEmail(updateAdminModel.getEmail());
		admin.setPhoneNumber(updateAdminModel.getPhoneNumber());
		admin.setRole(updateAdminModel.getRole());
		admin.setCity(updateAdminModel.getCity());
		admin.setState(updateAdminModel.getState());
		admin.setCountry(updateAdminModel.getCountry());
		admin.setAdminId(updateAdminModel.getUserId());

		
		boolean stored = adminDAO.updateAdminProfile(admin);

		boolean result = false;
		if (stored)	
			
			result = true;
		else
			result = false;

		return result;
	}

		
	}


