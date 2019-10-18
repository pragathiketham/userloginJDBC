package com.virtusa.DAO;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.entities.Admin;
import com.virtusa.model.LpDetailsModel;
import com.virtusa.model.ViewBatchDetailsModel;

public interface AdminDAO {

	public List<ViewBatchDetailsModel> viewBatchDetails() throws ClassNotFoundException, SQLException;

	public List<LpDetailsModel> lpDetailsListShow() throws ClassNotFoundException, SQLException;
    public boolean updateAdminProfile(Admin admin) throws ClassNotFoundException, SQLException;
	
}
