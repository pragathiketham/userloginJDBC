package com.virtusa.dao;

import java.sql.SQLException;

import com.virtusa.entities.Lp;

public interface LpDAO {

	public boolean updateLpdetails(Lp lp)throws ClassNotFoundException, SQLException;
}
