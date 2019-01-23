package DAOimplementation;

import java.sql.SQLException;
import DAO.DAOInterface;
import DBUtil.DBOperation;
import Model.Employee;


public class DAO implements DAOInterface {
	
	//Employee employee = new Employee("Suddam", "Basundhara", 70000);
	
	DBOperation operation = new DBOperation();
	

	@Override
	public boolean add(Employee employee) throws SQLException {


		return operation.insert(employee);
	}

	@Override
	public boolean delete(int id) throws SQLException {
		

		return operation.delete(id);
	}

	@Override
	public boolean updateById(Employee employee) throws SQLException {

		return operation.updateByID(employee);
	}
	
	public boolean updateByName(Employee employee) throws SQLException {

		return operation.updateByName(employee);
	}

	@Override
	public boolean search(int id) throws SQLException {

		return operation.find(id);
	}

}
