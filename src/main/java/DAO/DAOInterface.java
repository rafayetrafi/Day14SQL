package DAO;

import java.sql.SQLException;

import Model.Employee;

public interface DAOInterface {
	
	public boolean add(Employee employee) throws SQLException;
	public boolean delete(int id) throws SQLException;
	public boolean updateById(Employee employee) throws SQLException;
	public boolean updateByName(Employee employee) throws SQLException;
	public boolean search(int id) throws SQLException;
	

}
