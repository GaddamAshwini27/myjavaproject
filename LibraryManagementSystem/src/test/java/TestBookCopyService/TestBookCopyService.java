package TestBookCopyService;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.example.entities.BookCopy;
import com.example.entities.Books;
import com.example.entities.User;
import com.hibernateUtil.HibernateUtil;
import com.library.service.BookCopyService;
import com.library.service.UserService;
import com.library.serviceImpl.BookCopyServiceImpl;
import com.library.serviceImpl.UserServiceImpl;

public class TestBookCopyService {

	static SessionFactory sessionFactory;
	static Session session;
	static BookCopyService bookCopyservice;

	@BeforeAll
	static void setup() {
		sessionFactory = HibernateUtil.getSessionFactory();
		bookCopyservice = new BookCopyServiceImpl();
	}
	//@Test
   //  void testsaveBookCopy() {

	//BookCopy bookcopy = new BookCopy(14 ,11 , 'A',books);
//	assertTrue(bookCopyservice.saveBookcopy(bookcopy));
//}

// @Test
//void testGetBookCopyById() {

// BookCopy bookcopy = bookcopyservice.getBookCopyById(103);
// assertNotNull(bookcopyservice.saveBookCopy(bookcopy));

// }

// @Test
// void testUpdateBookCopy() {
// BookCopy bookcopy = new BookCopy(14,11, 'A',books);

// boolean updatedbookcopy = bookcopyservice.updateBookCopy(103);
// assertTrue(updatedbookcopy);

// }

// @Test

// void testGetBookCopy() {

// List<BookCopy> bookcopyList = bookcopyservice.getBookCopy(bookcopy);
// assertNotNull(bookcopyList);

// }

// @Test
// void testDeleteBookCopy() {
// boolean success = bookcopyservice.deleteBookCopy(1);
// assertTrue(success);
// assertNull(bookcopyservice.getBookCopyId(1));
 //}

	
	@AfterAll
	static void tearDown() {
		sessionFactory.close();
	}
}
