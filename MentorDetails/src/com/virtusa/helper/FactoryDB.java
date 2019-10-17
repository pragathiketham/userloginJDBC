package com.virtusa.helper;

import com.virtusa.dao.MentorDAO;
import com.virtusa.dao.MentorDAOImpl;
import com.virtusa.service.MentorService;
import com.virtusa.service.MentorServiceImpl;

public class FactoryDB{
	
	public static MentorDAO createMentorDAO(){
		MentorDAO mentorDAO=new MentorDAOImpl();
		return mentorDAO;
	}
	

	public static MentorService createMentorService(){
		MentorService mentorservice=new MentorServiceImpl();
		return mentorservice;
	}
	
}
