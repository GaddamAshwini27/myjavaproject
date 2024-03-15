package com.library.serviceImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.example.dao.UserDAO;
import com.example.daoImpl.UserDAOImpl;
import com.example.entities.User;
import com.library.service.UserService;

public class UserServiceImpl implements UserService {
	UserDAO userdao = new UserDAOImpl();

	public boolean saveUser(User user) {
		return userdao.saveUser(user);

	}

	public User getUserById(int userid) {
		return userdao.getUserById(userid);
		 

	}

	public boolean updateUser(int userId) {
		return userdao.updateUser(userId);

	}

	public boolean deleteUser(int userId) {
		return userdao.deleteUser(userId);

	}

	public List<User> getUser(User user) {
		return userdao.getUser(user);
	}

}