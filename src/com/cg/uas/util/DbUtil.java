package com.cg.uas.util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DbUtil 
{

static Connection conn = null;
	
	public static Connection getConnection() throws NamingException, SQLException 
	{
		
			InitialContext  ic = new InitialContext();
			DataSource ds  = (DataSource)ic.lookup("java:/myDS");
			conn = ds.getConnection();
		
		return conn;
		
	}
}
