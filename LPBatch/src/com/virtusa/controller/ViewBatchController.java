package com.virtusa.controller;

import javax.servlet.http.HttpServlet;

import com.virtusa.helper.FactoryDB;
import com.virtusa.service.AdminService;

public class ViewBatchController extends HttpServlet{

	private AdminService adminService;
	ViewBatchController(){
		this.adminService = FactoryDB.createAdminService();
	}
	
	public void init() {

	}
	
	
}
