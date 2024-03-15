package com.example.dao;

import java.util.List;

import com.example.entities.User;

public interface UserDAO {
	public boolean saveUser(User user);

	public User getUserById(int userid);

	public boolean updateUser(int userId);

	public boolean deleteUser(int userId);

	List<User> getUser(User user);
}
