package nazTech.us.DayFourteenSQL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.Test;

import DAOimplementation.DAO;
import DBUtil.DBOperation;
import Model.Employee;

public class TestOperation {
	
	DAO dao = new DAO();
	DBOperation operation = new DBOperation();
	
	@Test
	public void addEmpTest() throws SQLException
	{
		Employee em = new Employee("Rafyaet", "Bangladesh", 1256789);
		
		//EmployeeDAOimplimentation eo = new EmployeeDAOimplimentation();
		
		assertTrue(dao.add(em));
		
	}
	
	@Test
	public void deleteTest() throws SQLException
	{
		assertTrue(dao.delete(5));
	}
	
	
	@Test
	public void updatebyNameTest() throws SQLException
	{
		Employee employee = new Employee("Rafyae", "Bangladesh", 200);
		//Employee em1 = new Employee(1, "New Ro", "CTG", 124578);
		
		assertTrue(dao.updateByName(employee));
	}
	
	
	@Test
	public void updatebyIdTest() throws SQLException
	{
		Employee employee = new Employee(11,"Hossain", "Dhaka", 1000);
		//Employee em1 = new Employee(1, "New Ro", "CTG", 124578);
		
		assertTrue(dao.updateById(employee));
	}
	
	
	@Test
	public void findTest() throws SQLException
	{
		
		assertTrue(dao.search(8));
	}
	
	@Test
	public void avgTest() throws SQLException
	{
		
		assertEquals(769, operation.avgValue());

	}
	
	@Test
	public void minTest() throws SQLException
	{
		
		assertEquals(200, operation.minValue());

	}
	
	@Test
	public void maxTest() throws SQLException
	{
		
		assertEquals(2019, operation.maxValue());

	}
	

}
