package Frontend;
import java.sql.SQLException;
import java.util.*;

import Backend.DBHome;
import Backend.allQuery;
public class SuperAdmin {
	static void addAdmin() throws SQLException {
		String name,password,gender,aadharNo,phoneNo;
		int age;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the username of the Admin:");
		name=sc.nextLine();
		System.out.println("Enter the password for Admin:");
		password=sc.nextLine();
		System.out.print("Enter the Gender of the Employee(Male/Female/Other):\t");
		gender=sc.nextLine();
		System.out.print("Enter the Age of the Employee:\t");
		age=sc.nextInt();
		sc.nextLine();		
		System.out.print("Enter the Aadhar Card No. of the Employee:\t");
		aadharNo=sc.nextLine();
		System.out.print("Enter the Phone No. of the Employee:\t");
		phoneNo=sc.nextLine();
		
		
		allQuery.insertEmpData(DBHome.getCon(),name,password,gender,age,aadharNo,phoneNo,1);
		
		
	}
	static void removeAdmin() throws SQLException {
		int id;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ID of the Admin:");
		id=sc.nextInt();sc.nextLine();
		
        allQuery.deleteEmpData(DBHome.getCon(),id);
	}
	static void listAdmin() {
		String data;
		
//		data=getAdminData();
		
	}
	public static void main() throws SQLException {
		int choice,rechoose = 0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter Your Choice:\n"
					+ "1. Add Admin\n"
					+ "2. Remove Admin");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1: addAdmin();break;
			case 2: removeAdmin();break;
			case 3: listAdmin();break;
			default: System.out.println("Wrong Choice, press 1 to rechoose or press any other key");
					rechoose=sc.nextInt();sc.nextLine();
			}
			if(rechoose==0) {
				System.out.println("Press 1 to rechoose or press any other key");
				rechoose = sc.nextInt();sc.nextLine();
			}
				
		}while(rechoose==1);
	}
}
