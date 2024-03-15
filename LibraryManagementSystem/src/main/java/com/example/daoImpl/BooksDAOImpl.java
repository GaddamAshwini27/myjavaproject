package com.example.daoImpl;

import java.util.List;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;

import com.example.dao.BooksDAO;
import com.example.entities.Author;
import com.example.entities.Books;
import com.hibernateUtil.HibernateUtil;

public class BooksDAOImpl implements BooksDAO {
	Session session;
	Session sessionFactory;

	

	@Override
	public boolean saveBooks(Books books) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			session.save(books);
			tx.commit();
			return true;
		} catch (HibernateException e) {
			System.out.println("Hibernate Exception is :" + e);
		} catch (Exception e) {
			System.out.println("Exception is :" + e);
		}
		return false;
	}

	@Override
	public List<Books> getBooks(Books books) {
		try (Session session = HibernateUtil.getSession()) {
			Query<Books> query = session.createQuery("FROM Books WHERE name = :name", Books.class);
			query.setParameter("name", books.getPublisherName());
			return query.getResultList();
		}
	}

	@Override
	public void getBooksById(int booksId) {
		try (Session session = HibernateUtil.getSession()) {
			Books books = session.get(Books.class, booksId);
			if (books != null) {
				System.out.println("Books found with ID: " + booksId);
				System.out.println("Books Name: " + books.getPublisherName());
			} else {
				System.out.println("Books not found with ID: " + booksId);
			}
		}
	}

	@Override
	public boolean updateBooks(int BooksId) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			Books books = session.get(Books.class, BooksId);
			session.update(books);
			tx.commit();
			return true;
		} catch (HibernateException e) {
			System.out.println("Hibernate Exception is :" + e);
		} catch (Exception e) {
			System.out.println("Exception is :" + e);
		}
		return false;
	}

	@Override
	public boolean deleteBooks(int booksId) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			Books books = session.get(Books.class, booksId);
			if (books != null) {
				session.delete(booksId);
				tx.commit();
				return true;
			} else {
				System.out.println("Books not found with ID: " + booksId);
			}
			return false;
		}
	}
}
