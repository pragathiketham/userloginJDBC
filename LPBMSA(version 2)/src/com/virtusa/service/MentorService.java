package com.virtusa.service;

import java.util.Scanner;

import com.virtusa.view.MentorView;
import com.virtusa.entities.Mentor;

public class MentorService {
	
	public static void view_Training_Calender() {
		System.out.println("View Training Calender");
		MentorView.training_Calender();
		
	}
	public static void edit_Training_Calender() {
		System.out.println("Edit Training Calender");
		MentorView.training_Calender();
		
	}
	public static void view_Training_Status() {
		System.out.println("***View Training Status***");
		System.out.println("Batch ID:"+ Mentor.getBatch_Id());
		System.out.println("Batch Name:"+ Mentor.getBatch_name());
		System.out.println("Training Started On "+ Mentor.getTraining_start_date());
		System.out.println("No.of Days Completed of the Training Batch "+Mentor.getBatch_name()+":"+ Mentor.getTraining_daysCompleted() + " Days" );
		System.out.println("====================================");
		MentorView.training_Calender();
		
	}
	public static void edit_Training_Status() {
		Scanner scan =new Scanner(System.in);
		System.out.println("***Edit Training Status***");	
		System.out.println("Batch ID:");
		Mentor.setBatch_Id(scan.nextInt());
		System.out.println("Batch Name:");
		Mentor.setBatch_name(scan.next());
		System.out.println("Training started On: ");
		 Mentor.setTraining_start_date(scan.next());
		System.out.println("No.of Days Completed: ");
		 Mentor.setTraining_daysCompleted(scan.nextInt());
		 System.out.println("====================================");
		MentorView.training_Calender();
		
	}
	public static void view_Mentor_Details() {
		System.out.println("***View Your Details***");
		MentorView.mentorProfile();
	}
	public static void edit_Mentor_Details() {
		System.out.println("***Edit your Details***");
		MentorView.mentorProfile();
	}
	public static void create_New_Batch() {
		Scanner scan = new Scanner(System.in);
		System.out.println("***Create a New Batch***");
		System.out.println("Batch ID: ");
		Mentor.setNewbatch_Id(scan.nextInt());
		System.out.println("Name Of the Batch: ");
		Mentor.setNewbatch_name(scan.next());
		System.out.println("No.of Lp's in the Batch"+Mentor.getBatch_name()+": " );
		Mentor.setTotal_batch_count(scan.nextInt());
		System.out.println("Training Duration(in Days): ");
		MentorView.my_Lp_Batch();
		
	}
	public static void View_MyLPBatch_Details() {
			System.out.println("***My LP Batch Details***");
			MentorView.my_Lp_Batch();
		
	}
	public static void enroll_Lps() {
			System.out.println("***Enroll LPs***");
			MentorView.all_Lps();
		}

	public static void view_Lp_Details() {
		         System.out.println("***View Lp Details***");
		         MentorView.all_Lps();
		}
		
}