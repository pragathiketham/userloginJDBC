package com.virtusa.controller;



import com.virtusa.helper.HelperFactory;
import com.virtusa.models.LpModel;
import com.virtusa.service.LpService;
import com.virtusa.view.LpView;

public class LpController {

	private LpService lpService;
	LpView lpView=new LpView();
	
	public LpController() {
		this.lpService=
				HelperFactory.createLpService();
	}
	
	
	
	public void handleUpdateLpDetails(LpModel model) {
		String outcome=lpService.updateLpDetails(model);
		if(outcome.contentEquals("success")) {
			lpView.showLpUpdateSuccess(model);	
		}else {
		 lpView.showLpUpdateFailure(model);
		}
		
	}
}
