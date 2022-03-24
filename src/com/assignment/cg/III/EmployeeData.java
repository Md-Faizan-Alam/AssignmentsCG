package com.assignment.cg.III;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

// This code was originally run and tested inside a project that had the 
// "org.postgresql.Driver" dependency available inside the Maven Dependencies Folder
// Due to the absence of the above mentioned Class this code will not run inside this package

// Provided in this package is a SQL file that was executed to create and test the
// 'employee' table used in this code the name of the database containing the table
// was 'assignmentdb'.

public class EmployeeData {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String dept,desgn;
		Connection con = null;
		try {
			// Connecting to postgresql
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/assignmentdb";
			String userName = "postgres";
			String password = "password";
			con = DriverManager.getConnection(url,userName,password);
			
			// Checking for Connection status
			if(con != null) {
				System.out.println("Successfully connected");
			}
			else {
				System.out.println("Unable to connect");
			}
			
			PreparedStatement stmt = con.prepareStatement("select * from employee where department = ? and designation = ? ;");
			System.out.print("Enter the Department of the Employee : ");
			dept = sc.next();
			try {
				stmt.setString(1, dept);
			}catch(Exception e) {
			}
			
			System.out.print("Enter the Designation of the Employee : ");
			desgn = sc.next();
			try {
				stmt.setString(2, desgn);
			}catch(Exception e) {
			}
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				System.out.println("Employee No. : "+rs.getString("empno"));
				System.out.println("Name : "+rs.getString("empname"));
				System.out.println("Department : "+rs.getString("department"));
				System.out.println("Designation : "+rs.getString("designation"));
				System.out.println("Salary : Rs."+rs.getString("salary"));
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				System.out.println("Connection closed");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
