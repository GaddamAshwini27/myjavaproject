package com.example.daoImpl;

import com.example.dao.AuthorDAO;
import com.example.entities.Author;
import com.hibernateUtil.HibernateUtil;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class AuthorDAOImpl implements AuthorDAO {
	SessionFactory sessionFactory;

	@Override
	public boolean saveAuthor(Author author) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			session.save(author);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			System.out.println("Hibernate Exception is :" + e);
		} catch (Exception e) {
			System.out.println("Exception is :" + e);
		}
		return false;
	}

	@Override
	public List<Author> getAuthor(Author author) {
		try (Session session = HibernateUtil.getSession()) {
			Query<Author> query = session.createQuery("FROM Author WHERE name = :name", Author.class);
			query.setParameter("name", author.getName());
			return query.getResultList();
		}
	}

	@Override
	public Author getAuthorById(int authorId) {
		try (Session session = HibernateUtil.getSession()) {
			Author author = session.get(Author.class, authorId);

			if (author != null) {
				System.out.println("Author found with ID: " + authorId);
				System.out.println("Author Name: " + author.getName());

			} else {
				System.out.println("Author not found with ID: " + authorId);
			}
		}
		;
		return null;
	}

	@Override
	public boolean updateAuthor(int authorId) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			Author author = session.get(Author.class, authorId);
			session.update(author);
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
	public boolean deleteAuthor(int authorId) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			Author author = session.get(Author.class, authorId);
			if (author != null) {
				session.delete(author);
				tx.commit();
				return true;
			} else {
				System.out.println("Author not found with ID: " + authorId);
			}
		}
		return false;
	}
}
