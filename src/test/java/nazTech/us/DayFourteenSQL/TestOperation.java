package nazTech.us.DayFourteenSQL;

import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.Test;

import DAOimplementation.EmployeeDAOimplimentation;
import DBUtil.DBEmployeeOperation;
import Model.Employee;

public class TestOperation {
	
	EmployeeDAOimplimentation eo = new EmployeeDAOimplimentation();
	
	@Test
	public void addEmpTest() throws SQLException
	{
		Employee em = new Employee("Rafyaet", "Bangladesh", 1256789);
		
		//EmployeeDAOimplimentation eo = new EmployeeDAOimplimentation();
		
		assertTrue(eo.addEmployee(em));
		
	}
	
	@Test
	public void deleteTest() throws SQLException
	{
		assertTrue(eo.deleteEmployee(5));
	}
	
	
	@Test
	public void updateTest() throws SQLException
	{
		Employee employee = new Employee("Rafyae", "Bangladesh", 200);
		Employee em1 = new Employee(1, "New Ro", "CTG", 124578);
		
		assertTrue(eo.updateEmployee(employee));
	}

}