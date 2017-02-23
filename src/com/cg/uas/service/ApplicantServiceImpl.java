package com.cg.uas.service;

import java.util.ArrayList;

import com.cg.uas.bean.Application;
import com.cg.uas.bean.ProgramsOffered;
import com.cg.uas.dao.ApplicantDAOImpl;
import com.cg.uas.dao.IApplicantDAO;
import com.cg.uas.exception.ApplicationException;

public class ApplicantServiceImpl implements IApplicantService
{

	IApplicantDAO appDao = new ApplicantDAOImpl();
		
	@Override
	public int addApplicant(Application app) throws ApplicationException
	{
		return appDao.addApplicant(app);
		
	}

	@Override
	public int generateAppId() throws ApplicationException
	{
		
		return appDao.generateAppId();
	}

	@Override
	public Application viewApplication(int applicationid) 
	{
		
		return appDao.viewApplication(applicationid);
	}

	@Override
	public ArrayList<Application> getAllApplications() 
	{
		return appDao.getAllApplications();
	}

	@Override
	public void update(Application app)
	{
		appDao.update(app);
		
	}

	@Override
	public ArrayList<ProgramsOffered> getAllPrograms()
{
		
		return appDao.getAllPrograms();
	}

	@Override
	public void update(ProgramsOffered prog) 
	{
		appDao.update(prog);
		
	}

	@Override
	public ProgramsOffered viewProgram(String programName) {
		
		return appDao.viewProgram(programName);
	}

}
