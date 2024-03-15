package TestAuthorService;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.example.entities.Author;
import com.hibernateUtil.HibernateUtil;
import com.library.service.AuthorService;
import com.library.serviceImpl.AuthorServiceImpl;

public class TestAuthorService {

	static SessionFactory sessionFactory;
	static Session session;
	static AuthorService authorservice;

	@BeforeAll
	static void setUp() {
		sessionFactory = HibernateUtil.getSessionFactory();

		authorservice = new AuthorServiceImpl();
	}

	//@Test
	//void testsaveAuthor() {

		//Author author = new Author(10, "WillianShakespeare", 'A');
		//assertTrue(authorservice.saveAuthor(author));

	//}

	// @Test
	//void testGetAuthorById() {

	// Author author = authorservice.getAuthorById(103);
	// assertNotNull(authorservice.saveAuthor(author));

	// }

	// @Test
	// void testUpdateAuthor() {
	// Author author = new Author(103, "WillianShakespeare", 'A');

	// boolean updatedauthor = authorservice.updateAuthor(103);
	// assertTrue(updatedauthor);

	// }

	// @Test

	// void testGetAuthor() {

	// List<Author> authorList = authorservice.getAuthor(author);
	// assertNotNull(authorList);

	// }

	 @Test
	 void testDeleteAuthor() {
	 boolean success = authorservice.deleteAuthor(1);
	// assertTrue(success);
	 assertNull(authorservice.getAuthorById(1));
	 }

	@AfterAll
	static void tearDown() {
		sessionFactory.close();
	}

}
