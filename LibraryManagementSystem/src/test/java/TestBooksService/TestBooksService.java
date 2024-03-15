package TestBooksService;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.example.entities.Author;
import com.example.entities.Books;
import com.hibernateUtil.HibernateUtil;
import com.library.service.BooksService;
import com.library.serviceImpl.BooksServiceImpl;



public class TestBooksService {
	static SessionFactory sessionFactory;
	static Session session;
	static BooksService booksservice;

	@BeforeAll
	static void setup() {
		sessionFactory = HibernateUtil.getSessionFactory();
		booksservice = new BooksServiceImpl();
	}

	@Test
	public void testSaveUser() {
		Set<Author> authorSet = new HashSet<Author>();
		authorSet.addAll(authorSet);
		Books books = new Books(2, "Echoes of Eternity", 14.99, "Lumina Books", 'A', authorSet);
		assertTrue(booksservice.saveBooks(books));

	}
	// @Test
	//void testGetBooksById() {

	// Books books = booksservice.getBooksById(103);
	// assertNotNull(booksservice.saveBooks(books));

	// }

	// @Test
	// void testUpdateBooks() {
	// Books books = new Books(14,11, 'A',books);

	// boolean updatedbooks = booksservice.updateBooks(2, "Echoes of Eternity", 14.99, "Lumina Books", 'A', authorSet);
	// assertTrue(updatedbooks);

	// }

	// @Test

	// void testGetBooks() {

	// List<Books> booksList = booksservice.getBooks(books);
	// assertNotNull(booksList);

	// }

	// @Test
	// void testDeleteBooks() {
	// boolean success = booksservice.deleteBooks(2, "Echoes of Eternity", 14.99, "Lumina Books", 'A', authorSet);
	// assertTrue(success);
	// assertNull(booksservice.getBooksId(2));
	 //}

	@AfterAll
	static void tearDown() {
		sessionFactory.close();
	}
}
