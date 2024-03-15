package TestUserService;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.example.entities.User;
import com.hibernateUtil.HibernateUtil;
import com.library.service.UserService;
import com.library.serviceImpl.UserServiceImpl;

public class TestUserService {
	static SessionFactory sessionFactory;
	static Session session;
	static UserService userService;

	@BeforeAll
	static void setup() {
		sessionFactory = HibernateUtil.getSessionFactory();
		userService = new UserServiceImpl();
	}

	// @Test
	// void testSaveUser() {
	// User user = new User(11, "Ashwini", "Fathepur", "9391271293", 'A');
	// assertTrue(userService.saveUser(user));

	// }
	//@Test
	//User testGetUserById() {

	//	User user = userService.getUserById(11);
	//	assertNotNull(userService.saveUser(user));
	//	return user;
	//}

	 @Test
	 void testUpdateUser() {
	 User user = new User(11, "Ashwini", "Fathepur", "9391271293", 'A');

	 boolean updateduser = userService.updateUser(11);
	 assertTrue(updateduser);

	}

	// @Test

	// void testGetAllUsers() {

	// List<User> userList = userService.getAllUsers();
	// assertNotNull(userList);

	// }

//	@Test
	// void testDeleteUser() {
	// boolean success = userService.deleteUser(11);
	// assertTrue(success);
	// assertNull(userService.getUserById11));
	// }

	@AfterAll
	static void tearDown() {
		sessionFactory.close();
	}
}
