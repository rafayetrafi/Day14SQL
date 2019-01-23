package DAOimplementation;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import DAO.EmployeeDAOinterface;
import DBUtil.DBEmployeeOperation;
import Model.Employee;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmployeeDAOimplimentation implements EmployeeDAOinterface {
	
	//Employee employee = new Employee("Suddam", "Basundhara", 70000);
	
	DBEmployeeOperation op = new DBEmployeeOperation();
	

	@Override
	public boolean addEmployee(Employee employee) throws SQLException {

		//Employee e1 = new Employee("Sohid","Lake Circus", 500000);
		
		boolean inserted = op.insert(employee);

		return inserted;
	}

	@Override
	public boolean deleteEmployee(int id) throws SQLException {
		
	
		boolean delete = op.delete(id);

		return delete;
	}

	@Override
	public boolean updateEmployeeByID(Employee employee) throws SQLException {

		boolean update = op.updateByID(employee);

		return update;
	}
	
	public boolean updateEmployeeByName(Employee employee) throws SQLException {

		boolean update = op.updateByName(employee);

		return update;
	}

	@Override
	public boolean userFindByID(int id) throws SQLException {

		boolean find = op.find(id);
		
		return find;
	}

}
