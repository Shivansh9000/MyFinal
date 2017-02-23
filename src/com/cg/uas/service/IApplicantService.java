package com.cg.uas.service;

import java.util.ArrayList;

import com.cg.uas.bean.Application;
import com.cg.uas.bean.ProgramsOffered;
import com.cg.uas.exception.ApplicationException;

public interface IApplicantService 
{


	public int addApplicant(Application app) throws ApplicationException;

	public int generateAppId() throws ApplicationException;
	
	public Application viewApplication(int applicationid);
	
	public ArrayList<Application> getAllApplications();
	
	public ArrayList<ProgramsOffered> getAllPrograms();
	
	public void update(Application app);
	
	public void update(ProgramsOffered prog);
	
	public ProgramsOffered viewProgram(String programName);
}