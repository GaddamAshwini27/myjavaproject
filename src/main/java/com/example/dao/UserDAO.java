package com.example.dao;

import java.util.List;

import com.example.entities.User;

public interface UserDAO {
	public void saveUser(User user);
	public void getUserById(int userid);
	public void updateUser(int userId);
	public void deleteUser(int userId);
	
	List<User> getUser(User user);
}
