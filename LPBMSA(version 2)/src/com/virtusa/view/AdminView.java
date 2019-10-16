package com.virtusa.view;

import java.util.Scanner;

import com.virtusa.service.AdminService;
import com.virtusa.service.MentorService;

public class AdminView {
	public static final Scanner scanner = new Scanner(System.in);
	public static void adminMenu()
	{
		while(true)
		{
		System.out.println("*Welocome to Admin HomePage**");
		System.out.println("====================================");
		System.out.println("Please Select any one option");
		System.out.println("1.Profile.");
		System.out.println("2.Mentor.");
		System.out.println("3.LP Batchs");
		System.out.println("4.Training Venue");
		System.out.println("0.Logout");
		System.out.println("====================================");
		init();
		}
		
		
	}
	private static void init() {
		 try {
			
	        int cmd = scanner.nextInt();
	        switch (cmd) {
	       
	            case 1:
	               adminProfile();
	                break;
	            case 2:
	                mentor_Tasks();
	                break;
	            case 3:
	                all_LpBatches();
	                break;
	            case 4:
	                training_Venue();
	                break;
	            case 0:
	            	System.out.println("Conform Logout?Enter 00 ");
	                break;
	            default : System.out.println("**Please Enter Valid Option**");
	            adminMenu();
	        }
		 } catch (Exception ex) {
	            System.err.println("Oops! We have detected an issue.");
	            System.err.println("Please try again.");
	        }
				}
					
	private static void training_Venue() {
		System.out.println("Welcome to Training Venue Details");
		System.out.println("====================================");
		System.out.println("Please Select any one option");
		System.out.println("41.View Training Venue Details.");
		System.out.println("42.Block Training Venue for LP Batch.");
		System.out.println("Enter '0' to go back to Mentor Menu");
		System.out.println("====================================");
		init4();
	}
	private static void init4() {
		try {
		
        int cmd4 = scanner.nextInt();
        switch (cmd4) {	      
            case 41:
            	AdminService.view_Training_Details ();
                break;
            case 42:
            	AdminService.block_Training_Venue();
                break;
            case 0:
            	adminMenu();
                break;              
            default : System.out.println("**Please Enter Valid Option**");
            all_LpBatches();
                }
	} catch (Exception ex) {
        System.err.println("Oops! We have detected an issue.");
        System.err.println("Please try again.");
	}
    }
		
	private static void all_LpBatches() {
		System.out.println("Welcome to  LP Batch Details");
		System.out.println("====================================");
		System.out.println("Please Select any one option");
		System.out.println("31.View LP Batch Details.");
		System.out.println("31.View Training Calender of LP Batchs.");
		System.out.println("Enter '0' to go back to Mentor Menu");
		System.out.println("====================================");
	   init3();
		}
	
	private static void init3() {
		try {
		
        int cmd3 = scanner.nextInt();
        switch (cmd3) {	      
            case 31:
            	AdminService.lpBatch_Details();
                break;
            case 32:
            	AdminService.view_Training_Calender();
                break;
            case 0:
            	adminMenu();
                break;              
            default : System.out.println("**Please Enter Valid Option**");
            all_LpBatches();
                }
	} catch (Exception ex) {
        System.err.println("Oops! We have detected an issue.");
        System.err.println("Please try again.");
    }
	}
	private static void mentor_Tasks() {
		System.out.println("Welcome to Mentor Tasks");
		System.out.println("====================================");
		System.out.println("Please Select any one option");
		System.out.println("21.View Mentor Details");
		System.out.println("22.Assign Mentor to LP Batch");
		System.out.println("23.View Training Status of LP Batches");
		System.out.println("Enter '0' to go back to Mentor Menu");
		System.out.println("====================================");
		init2();
	}
	private static void init2() {
		try {
			
	        int cmd2 = scanner.nextInt();
	        switch (cmd2) {
	        
	            case 21:
	            	AdminService.view_Mentor_Details();
	                break;
	            case 22:
	            	AdminService.assign_Mentor();
	                break;
	            case 23:
	            	AdminService.view_Training_Status();
	                break;
	            case 0:
	            	adminMenu();
	                break;
	            default : System.out.println("**Please Enter Valid Option**");
	            mentor_Tasks();
	                }
	} catch (Exception ex) {
        System.err.println("Oops! We have detected an issue.");
        System.err.println("Please try again.");
    }
	}
	private static void adminProfile() {
		System.out.println("My Profile");
		System.out.println("====================================");
		System.out.println("Please Select any one option");
		System.out.println("11.View Your Profile");
		System.out.println("12.Edit Your Profile");
		System.out.println("Enter '0' to go back to Mentor Menu");
		System.out.println("====================================");
		init1();
		}
	
	private static void init1() {
		try {
		
        int cmd1 = scanner.nextInt();
        switch (cmd1) {	      
            case 11:
            	AdminService.view_Admin_Details();
                break;
            case 12:
            	AdminService.edit_Admin_Details();
                break;
            case 0:
              adminMenu();
                break;
            default : System.out.println("**Please Enter Valid Option**");
            adminProfile();
                }	
	} catch (Exception ex) {
        System.err.println("Oops! We have detected an issue.");
        System.err.println("Please try again.");
    }
  }
}

