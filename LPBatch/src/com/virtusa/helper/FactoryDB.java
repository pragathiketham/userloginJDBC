package com.virtusa.helper;

import com.virtusa.DAO.AdminDAO;
import com.virtusa.DAO.AdminDAOImpl;
import com.virtusa.service.AdminService;
import com.virtusa.service.AdminServiceImpl;



public class FactoryDB{
	
	public static AdminDAO createAdminDAO(){
		AdminDAO adminDAO=new AdminDAOImpl();
		return adminDAO;
	}
	

	public static AdminService createAdminService(){
		AdminService mentorservice=new AdminServiceImpl();
		return mentorservice;
		
		}
	
	
	
	
}
