package com.virtusa.entities;

public class Mentor {
	static String training_start_date;
	static int training_daysCompleted;
	static int newbatch_Id;
	static int batch_Id;
	static String batch_name;
	static String newbatch_name;
	static int total_batch_count;
	
	public static String getTraining_start_date() {
		return training_start_date;
	}
	public static void setTraining_start_date(String training_start_date) {
		Mentor.training_start_date = training_start_date;
	}
	public static int getTraining_daysCompleted() {
		return training_daysCompleted;
	}
	public static void setTraining_daysCompleted(int training_daysCompleted) {
		Mentor.training_daysCompleted = training_daysCompleted;
	}
	public static int getNewbatch_Id() {
		return newbatch_Id;
	}
	public static void setNewbatch_Id(int newbatch_Id) {
		Mentor.newbatch_Id = newbatch_Id;
	}
	public static int getBatch_Id() {
		return batch_Id;
	}
	public static void setBatch_Id(int batch_Id) {
		Mentor.batch_Id = batch_Id;
	}
	public static String getBatch_name() {
		return batch_name;
	}
	public static void setBatch_name(String batch_name) {
		Mentor.batch_name = batch_name;
	}
	public static String getNewbatch_name() {
		return newbatch_name;
	}
	public static void setNewbatch_name(String newbatch_name) {
		Mentor.newbatch_name = newbatch_name;
	}
	public static int getTotal_batch_count() {
		return total_batch_count;
	}
	public static void setTotal_batch_count(int total_batch_count) {
		Mentor.total_batch_count = total_batch_count;
	}
	@Override
	public String toString() {
		return "Mentor []";
	}
	
	
}
