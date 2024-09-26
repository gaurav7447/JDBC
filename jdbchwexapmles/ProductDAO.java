package com.jdbchwexapmles;

import java.sql.SQLException;

interface ProductDAO {
	void save(Product pr); 
	void read() throws SQLException,ClassNotFoundException;
	void update() throws SQLException,ClassNotFoundException;
	void delete() throws SQLException,ClassNotFoundException;
	

}
