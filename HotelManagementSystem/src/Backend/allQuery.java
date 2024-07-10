package Backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.PreparableStatement;

public class allQuery {
    
	public static boolean login(Connection con,int user_id,String password,int choice) throws SQLException {
		
		String query="Select count(*) from employee_data where emp_id=? AND passwd=? AND emp_role=?";
		
		
		
		PreparedStatement psmt=con.prepareStatement(query);
		psmt.setInt(1, user_id);
		psmt.setString(2, password);
		psmt.setInt(3, choice);
		
		ResultSet resultSet=psmt.executeQuery();
		
		
		return false;
		
	}
	
	
	
	public static void insertEmpData(Connection con,String emp_name,String password,String gender,int age,String aadhar_no,String phone_no,int emp_role) throws SQLException {
		String query="insert into employee_data(passwd,emp_name,age,aadhar_no,phone_no,gender,emp_role) values (?,?,?,?,?,?,?)";
		PreparedStatement psmt=con.prepareStatement(query);
		psmt.setString(1, password);
		psmt.setString(2, emp_name);
		psmt.setInt(3, age);
		psmt.setString(4, aadhar_no);
		psmt.setString(5, phone_no);
        psmt.setString(6, gender);
        psmt.setInt(7, emp_role);
        
        psmt.execute();
        
        System.out.println("Data Added Successfully");
        
		
	
	}
	
	



	public static void deleteEmpData(Connection con,int id) throws SQLException {
		// TODO Auto-generated method stub
		String query="delete from employee_data where emp_id=?";
		PreparedStatement psmt=con.prepareStatement(query);
		psmt.setInt(1, id);
		
		psmt.execute();
		
		System.out.println("Admin data Deleted Successfully");
		
	}


    public static ResultSet fetchUserdata(Connection con,int emp_role) throws SQLException {
    	String qeury="select * from employee_data where emp_role=?";
    	
    	PreparedStatement psmt=con.prepareStatement(qeury);
    	psmt.setInt(1, emp_role);
    	
    	ResultSet resultSet=psmt.executeQuery();
    	
    	return resultSet;
    	
    }
	
	
	
	
	
	
	
	
	
}
