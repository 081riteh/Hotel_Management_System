package Backend;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class tableCreation {
	
	
	private static boolean tableExistsSQL(Connection con ,String tableName) throws SQLException {
		DatabaseMetaData meta=con.getMetaData();
		ResultSet resultSet=meta.getTables(null, null, tableName, new String[] {"TABLE"});
		return resultSet.next();
	}
	
   
    public static void createTable(Connection con) throws SQLException {
		
		//user table 
		if(!tableExistsSQL(con,"roomAvailability")) {
			String query="create table roomAvailability(room_id int primary key auto_increment,room_size int not null,room_type varchar(30) not null,available int not null)";
		    Statement st=con.createStatement();
		    st.execute(query);
		
		}
		if(!tableExistsSQL(con,"hotel_customer")) {
			String query="create table hotel_customer(user_id int primary key auto_increment,passwd varchar(200) not null,user_name varchar(200) not null,age int not null,aadhar_no varchar(16) not null,phone_no varchar(10) not null,Gender varchar(10) not null,amount int default 0,room_id int not null,foreign key(room_id) references roomAvailability(room_id))";
			Statement st=con.createStatement();
		    st.execute(query);
		    
        }
		if(!tableExistsSQL(con,"role_category")) {
			String query="create table role_category(role_id int primary key auto_increment,role_name varchar(30) not null)";
			Statement st=con.createStatement();
		    st.execute(query);	
		}
		if(!tableExistsSQL(con,"order_food")) {
			String query="create table order_food(food_id int primary key auto_increment,food_name varchar(30) not null,price int not null)";
			Statement st=con.createStatement();
		    st.execute(query);
		}
		if(!tableExistsSQL(con,"Employee_Data")) {
			String query="create table Employee_Data(Emp_id int primary key auto_increment,passwd varchar(200),Emp_name varchar(200) not null,age int not null,aadhar_no varchar(16) not null,phone_no varchar(10) not null,Gender varchar(10) not null,Emp_role int not null,foreign key(Emp_role) references role_category(role_id))";
			Statement st=con.createStatement();
		    st.execute(query);
		}
		
	}
}
