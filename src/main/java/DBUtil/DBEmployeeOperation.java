package DBUtil;

import java.sql.*;

import Model.Employee;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DBEmployeeOperation {

	DBConnection dbConnection = DBConnection.getInstance();
	Connection con = dbConnection.getConnection();

	public boolean insert(Employee emp) throws SQLException
	{

		//String query = "INSERT into rafayet_student_Table (name, residence, salary) VALUES (? ? ?)";
		
		String query = "INSERT into rafayet_student_Table (name, residence, salary) VALUES (?, ?, ?)";
		
		
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1, emp.getName());
		statement.setString(2, emp.getResidence());
		statement.setInt(3, emp.getSalary());
		
		int rowUpdated = statement.executeUpdate();

		if(rowUpdated > 0)
		{
			dbConnection.closeConnection();
			log.info("Insert successfully");
			return true;
			
			
		}
		else
		{
			dbConnection.closeConnection();
			log.info("Insert Unsuccessfull");
			return false;
		}
			
	}

	public boolean updateByName(Employee employee) throws SQLException {
		
		String query = "Update rafayet_student_Table set residence = ?, salary = ? where name = ?";
		
		PreparedStatement statement = con.prepareStatement(query);
		
		statement.setString(1, employee.getResidence());
		statement.setInt(2, employee.getSalary());
		statement.setString(3, employee.getName());
		
		int rowUpdated = statement.executeUpdate();

		if(rowUpdated > 0)
		{
			dbConnection.closeConnection();
			log.info("Update successfully");
			return true;
			
			
		}
		else
		{
			dbConnection.closeConnection();
			log.info("Update Unsuccessfull");
			return false;
		}
			
	}
	
	public boolean updateByID(Employee employee) throws SQLException {
		
		String query = "Update rafayet_student_Table set name = ?, residence = ?, salary = ? where id = ?";
		
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1, employee.getName());
		statement.setString(2, employee.getResidence());
		statement.setInt(3, employee.getSalary());
		statement.setInt(4, employee.getId());
		
		int rowUpdated = statement.executeUpdate();

		if(rowUpdated > 0)
		{
			dbConnection.closeConnection();
			log.info("Update successfully");
			return true;
			
			
		}
		else
		{
			dbConnection.closeConnection();
			log.info("Update Unsuccessfull");
			return false;
		}
			
	}
	
	

	public boolean delete(int id) throws SQLException {
		
		String query = "delete from rafayet_student_Table where id=?";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setInt(1, id);
		
		int rowUpdated = statement.executeUpdate();

		if(rowUpdated > 0)
		{
			dbConnection.closeConnection();
			log.info("Delete successfully");
			return true;
			
			
		}
		else
		{
			dbConnection.closeConnection();
			log.info("Delete Unsuccessfull");
			return false;
		}
			
		
		
		//return rowUpdated;
	}

	public boolean find(int id) throws SQLException {
		
		String query = "select * from rafayet_student_Table where id = ?";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setInt(1, id);
		
		ResultSet rowUpdated = statement.executeQuery();

		if(rowUpdated.next())
		{
			dbConnection.closeConnection();
			log.info("Data Found");
			return true;
			
			
		}
		else
		{
			dbConnection.closeConnection();
			log.info("Data Not found");
			return false;
		}
			
	}
	
	
	public boolean avgValue() throws SQLException
	{
		String query = "select avg(salary) from rafayet_student_Table";
		PreparedStatement statement = con.prepareStatement(query);
		
		
		
		ResultSet rowUpdated = statement.executeQuery();
		

		if(rowUpdated.next())
		{
			dbConnection.closeConnection();
			log.info("Avg test okay");
			return true;
			
			
		}
		else
		{
			dbConnection.closeConnection();
			log.info("Avg test not okay");
			return false;
		}

	}
	
	
	
	

}
