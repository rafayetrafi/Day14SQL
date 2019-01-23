package nazTech.us.DayFourteenSQL;

import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.Test;

import DAOimplementation.EmployeeDAOimplimentation;
import DBUtil.DBEmployeeOperation;
import Model.Employee;

public class TestOperation {
	
	EmployeeDAOimplimentation eo = new EmployeeDAOimplimentation();
	DBEmployeeOperation operation = new DBEmployeeOperation();
	
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
	public void updatebyNameTest() throws SQLException
	{
		Employee employee = new Employee("Rafyae", "Bangladesh", 200);
		//Employee em1 = new Employee(1, "New Ro", "CTG", 124578);
		
		assertTrue(eo.updateEmployeeByName(employee));
	}
	
	
	@Test
	public void updatebyIdTest() throws SQLException
	{
		Employee employee = new Employee(11,"Hossain", "Dhaka", 1000);
		//Employee em1 = new Employee(1, "New Ro", "CTG", 124578);
		
		assertTrue(eo.updateEmployeeByID(employee));
	}
	
	
	@Test
	public void findTest() throws SQLException
	{
		
		assertTrue(eo.userFindByID(8));
	}
	
	public void avgTest() throws SQLException
	{
		
		assertTrue(operation.avgValue(769.83333333333));
	}
	

}
