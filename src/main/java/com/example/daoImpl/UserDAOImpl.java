package com.example.daoImpl;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.RowSet;
import javax.swing.JList.DropLocation;

import com.example.entities.User;

public class UserDAOImpl {

	private int userid;
	private String name;
	private int mobileNo;
	private String Place;

	public void addUser(User user) {
		String url = "jdbc:mysql://localhost:3306/studentmanagementsystem";
		try {
			Connection connection = DriverManager.getConnection(url, "root", "ashwini27");
			String insertUser = "insert into user values(?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(insertUser);

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter user ID: ");
			int id = scanner.nextInt();

			System.out.println("Enter user Name: ");
			String username = scanner.next();

			System.out.println("Enter email: ");
			String email = scanner.next();

			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, username);
			preparedStatement.setString(3, email);

			int rowsInserted = preparedStatement.executeUpdate();

			System.out.println(rowsInserted + "rows inserted");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<User> selectAllUsers() {
		String url = "jdbc:mysql://localhost:3306/studentmanagementsystem";
		try {

			Connection connection = DriverManager.getConnection(url, "root", "root");
			String selectAllUsers = "select * from user";
			Statement statement = connection.createStatement();

			ResultSet rs = statement.executeQuery(selectAllUsers);
			List<User> userList = new ArrayList<User>();

			while (rs.next()) {
				User user= new User();
				user.setUserid(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setMobileNo(rs.getInt(3));
				user.setPlace(rs.getString(4));
				userList.add(user);
			}
			return userList;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
			return null;
		}
	}

	public void updateUser() {
		String url = "jdbc:mysql://localhost:3306/studentmanagementsystem";
		try {

			Connection connection = DriverManager.getConnection(url, "root", "root");
			String updateUser = "update user set username = ?,email = ? where userid = ?";

			PreparedStatement preparedStatement = connection.prepareStatement(updateUser);
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter user ID: ");
			int id = scanner.nextInt();

			System.out.println("Enter new user Name: ");
			scanner.nextLine();
			String username = scanner.nextLine();

			System.out.println("Enter new MobileNo: ");
			int mobileNo = scanner.nextInt();
			
			System.out.println("Enter new place: ");
			String Place = scanner.nextLine();

			preparedStatement.setInt(1, userid);
			preparedStatement.setString(2, name);
			preparedStatement.setInt(3,mobileNo );
			preparedStatement.setString(4,Place );


			int rowsUpdated = preparedStatement.executeUpdate();
			System.out.println(rowsUpdated + "rows Updated");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}
	}

	public void deleteUser() {
		String url = "jdbc:mysql://localhost:3306/studentmanagementsystem";
		try {

			Connection connection = DriverManager.getConnection(url, "root", "root");
			String deleteUser = "delete from user where userid = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(deleteUser);

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter user ID: ");
			int id = scanner.nextInt();

			preparedStatement.setInt(1, id);
			int rowsDeleted = preparedStatement.executeUpdate();
			System.out.println(rowsDeleted + "rows Deleted");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}
	}

}
