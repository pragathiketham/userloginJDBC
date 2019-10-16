package com.virtusa.service;

import java.sql.SQLException;
import com.virtusa.entities.Lp;

import com.virtusa.models.LpModel;

public class LpServiceImpl implements LpService {

	@Override
	public String updateLpDetails(LpModel model) {
		// TODO Auto-generated method stub
		
		Lp lp=new Lp();
		lp.setLpId(model.getLpId());
		
		
		if(model.getNewSalary()>25000) {
			employees.setSalary(model.getNewSalary());
		}else {
			try {
			throw new SalaryNotValidException("Salary not valid");
			}catch(SalaryNotValidException e) {
				System.out.println("!ERROR[Salary must be greater than 25000]");
			}
		}
		
		String result="fail";
		try {
			boolean updated=employeesDAO.updateEmployeeSalary(employees);
			if(updated)
				result="success";
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("!ERROR[Salary updation failed!!]");
		}
		return result;
	}

}
