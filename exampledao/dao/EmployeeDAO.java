package com.exampledao.dao;

import java.sql.SQLException;

interface EmployeeDAO {
	void save(Employee emp);
	void readEmployee() throws SQLException, ClassNotFoundException;
	void updataEmloyee() throws ClassNotFoundException, SQLException;
}


/*
 
 *  
 *
 */

