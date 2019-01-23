package DAO;

import java.sql.SQLException;

import Model.Employee;

public interface EmployeeDAOinterface {
	
	public boolean addEmployee(Employee employee) throws SQLException;
	public boolean deleteEmployee(int id) throws SQLException;
	public boolean updateEmployee(Employee employee) throws SQLException;
	public boolean userFindByID(int id) throws SQLException;

}
