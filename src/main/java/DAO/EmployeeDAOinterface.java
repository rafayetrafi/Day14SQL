package DAO;

import Model.Employee;

public interface EmployeeDAOinterface {
	
	public boolean addEmployee(Employee employee);
	public Employee deleteEmployee(int id);
	public Employee updateEmployee(int id);
	public Employee userFindByID(int id);

}
