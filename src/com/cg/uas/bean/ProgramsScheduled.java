package com.cg.uas.bean;

import java.util.Date;

public class ProgramsScheduled 
{

	private int scheduledProgramId;
	private String programName;
	private String location;
	private Date startDate;
	private Date endDate;
	private int sessionPerWeek;
	
	public ProgramsScheduled() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public ProgramsScheduled(int scheduledProgramId, String programName,
			String location, Date startDate, Date endDate, int sessionPerWeek) {
		super();
		this.scheduledProgramId = scheduledProgramId;
		this.programName = programName;
		this.location = location;
		this.startDate = startDate;
		this.endDate = endDate;
		this.sessionPerWeek = sessionPerWeek;
	}

	public int getScheduledProgramId() {
		return scheduledProgramId;
	}

	public void setScheduledProgramId(int scheduledProgramId) {
		this.scheduledProgramId = scheduledProgramId;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getSessionPerWeek() {
		return sessionPerWeek;
	}

	public void setSessionPerWeek(int sessionPerWeek) {
		this.sessionPerWeek = sessionPerWeek;
	}

	@Override
	public String toString() {
		return "ProgramsScheduled [scheduledProgramId=" + scheduledProgramId
				+ ", programName=" + programName + ", location=" + location
				+ ", startDate=" + startDate + ", endDate=" + endDate
				+ ", sessionPerWeek=" + sessionPerWeek + "]";
	}
	
	
	
	
}
