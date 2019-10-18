package com.virtusa.service;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.model.LpDetailsModel;
import com.virtusa.model.UpdateAdminModel;
import com.virtusa.model.ViewBatchDetailsModel;

public interface AdminService {

	public List<ViewBatchDetailsModel> getBatchDetails();
	public List<LpDetailsModel> lpViewLpDetails();
	public boolean storeAdminService(UpdateAdminModel updateAdminModel) throws ClassNotFoundException, SQLException;
}
