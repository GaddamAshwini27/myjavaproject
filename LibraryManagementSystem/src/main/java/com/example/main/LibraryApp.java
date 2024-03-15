package com.example.main;

import com.example.entities.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LibraryApp {
	public static void main(String[] args) {
		SessionFactory factory = null;
		try {
			factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

			Session session = factory.openSession();
			//Author author = new Author(103, "WillianShakespeare",'A');
			Author author1 = new Author(104, "Willian",'A');
			
			Set<Author> authorSet = new HashSet<Author>();
			authorSet.add(author1);
			Books books = new Books(3, "Echoes of Eternity", 14.99, "Lumina Books", 'A', authorSet);

			BookCopy bookcopy = new BookCopy(1409, 4, 'A', books);

			User user = new User(2, "Ashwini", "9391271293", "Fathepur", 'A');

			Issue issue = new Issue(103, LocalDate.parse("2024-01-24"), LocalDate.parse("2024-02-24"), 'A', bookcopy,
					user);

			session.beginTransaction();

			//session.save(author);
			session.save(author1);
			session.save(books);
			session.save(bookcopy);

			session.save(user);
			session.save(issue);
			session.getTransaction().commit();

			session.clear();
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
