package com.virtusa.helper;

import com.virtusa.dao.LpDAO;
import com.virtusa.dao.LpDAOImpl;
import com.virtusa.service.LpService;
import com.virtusa.service.LpServiceImpl;

public class HelperFactory {

	public static LpDAO createLpDAO(){
		LpDAO lpDAO=new LpDAOImpl();
		return lpDAO;
		
	}
	public static LpService createLpService(){
		LpService lpService=new LpServiceImpl();
		return lpService;
}
}
