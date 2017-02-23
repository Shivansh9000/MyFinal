package com.cg.uas.bean;

import java.sql.Date;

public class Application
{

	private int applicationId;
	private String fullName;
	private Date dob;
	private String highestQual;
	private double marks;
	private String goals;
	private String emailId;
	private String scheduledProgramId;
	private String status;
	private Date doi;
	
	public Application() 
	{
		super();
		
	}

	public Application(int applicationId, String fullName, Date dob,
			String highestQual, double marks, String goals, String emailId,
			String scheduledProgramId, String status, Date doi) {
		super();
		this.applicationId = applicationId;
		this.fullName = fullName;
		this.dob = dob;
		this.highestQual = highestQual;
		this.marks = marks;
		this.goals = goals;
		this.emailId = emailId;
		this.scheduledProgramId = scheduledProgramId;
		this.status = status;
		this.doi = doi;
	}

	public Application(String fullname2, java.util.Date dob2,
			String highestqual2, Double marks2, String goals2, String email,
			String scheduledProgramId2, String status2, java.util.Date doi2) 
	{
		
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getHighestQual() {
		return highestQual;
	}

	public void setHighestQual(String highestQual) {
		this.highestQual = highestQual;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getGoals() {
		return goals;
	}

	public void setGoals(String goals) {
		this.goals = goals;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getScheduledProgramId() {
		return scheduledProgramId;
	}

	public void setScheduledProgramId(String scheduledProgramId) {
		this.scheduledProgramId = scheduledProgramId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDoi() {
		return doi;
	}

	public void setDoi(Date doi) {
		this.doi = doi;
	}

	@Override
	public String toString() {
		return "Applicant [applicationId=" + applicationId + ", fullName="
				+ fullName + ", dob=" + dob + ", highestQual=" + highestQual
				+ ", marks=" + marks + ", goals=" + goals + ", emailId="
				+ emailId + ", scheduledProgramId=" + scheduledProgramId
				+ ", status=" + status + ", doi=" + doi + "]";
	}
	
	
	
}
