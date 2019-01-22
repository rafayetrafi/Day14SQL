package DAOimplementation;

import DAO.EmployeeDAOinterface;
import Model.Employee;

public class EmployeeDAOimplimentation implements EmployeeDAOinterface {
	

	@Override
	public boolean addEmployee(Employee employee) {

		employee.setEID(1);
		
		
		
		return false;
	}

	@Override
	public Employee deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee userFindByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
