package com.example.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.example.dao.UserDAO;
import com.example.entities.Author;
import com.example.entities.User;
import com.hibernateUtil.HibernateUtil;

public class UserDAOImpl implements UserDAO {

	private SessionFactory sessionFactory;

	@Override
	public boolean saveUser(User user) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			session.save(user);
			tx.commit();
			return true;
		}catch (HibernateException e) {
			System.out.println("Hibernate Exception is :" + e);
		} catch (Exception e) {
			System.out.println("Exception is :" + e);
	}return false;
	}
	@Override
	public List<User> getUser(User user) {
		try (Session session = HibernateUtil.getSession()) {
			Query<User> query = session.createQuery("FROM User WHERE name = :name", User.class);
			query.setParameter("name", user.getName());
			return query.getResultList();
		}
	}

	@Override
	public User getUserById(int UserId) {
		try (Session session = HibernateUtil.getSession()) {
			User user = session.get(User.class, UserId);
			if (user != null) {
				System.out.println("User found with ID: " + UserId);
				System.out.println("User Name: " + user.getName());
			} else {
				System.out.println("User not found with ID: " + UserId);
			}
		}
		return null;
	}

	@Override
	public boolean updateUser(int UserId) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			User user = session.get(User.class, UserId);
			session.update(UserId);
			tx.commit();
			return true;
		}catch (HibernateException e) {
			System.out.println("Hibernate Exception is :" + e);
		} catch (Exception e) {
			System.out.println("Exception is :" + e);
	}return false;
	}
	@Override
	public boolean deleteUser(int UserId) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			User user = session.get(User.class, UserId);
			if (user != null) {
				session.delete(user);
				tx.commit();
				return true;
			} else {
				System.out.println("User not found with ID: " + UserId);
			}
		}return false;
	}
}
