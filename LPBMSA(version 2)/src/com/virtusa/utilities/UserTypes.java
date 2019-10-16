package com.virtusa.utilities;

public enum UserTypes {

LP("LP"),ADMIN("ADMIN"),MENTOR("MENTOR");
	
	private String val;
	private UserTypes(String val) {
		this.val=val;
	}
	
	public String getVal() {
		return val;
		
	}
}
