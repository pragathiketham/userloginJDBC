package com.virtusa.view;


import com.virtusa.models.LpModel;

public class LpView {
	private LpMainView lpMainView=new LpMainView();
	
	
		
	
	

		public void showLpUpdateSuccess(LpModel model) {
			// TODO Auto-generated method stub
			System.out.println("\n Lp successfully updated for Lp id=>"+model.getUserId());
		}






		public void showLpUpdateFailure(LpModel model) {
			// TODO Auto-generated method stub
			System.out.println("\n Lp updated failed for lp id=>"+model.getUserId());
		}


}