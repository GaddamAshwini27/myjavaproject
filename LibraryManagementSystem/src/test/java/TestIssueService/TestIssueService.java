package TestIssueService;



import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.example.entities.Issue;
import com.hibernateUtil.HibernateUtil;
import com.library.service.IssueService;

import com.library.serviceImpl.IssueServiceImpl;


public class TestIssueService {
	 static SessionFactory sessionFactory;
	 Session session;
	 static IssueService issueService;

	@BeforeAll
	static void setup() {
		sessionFactory = HibernateUtil.getSessionFactory();
		issueService = new IssueServiceImpl();
	}

//	@Test
	// void testSaveIssue() {
		//Issue issue = new Issue(104, LocalDate.parse("2024-01-24"), LocalDate.parse("2024-02-24"), 'A', bookcopy,
			//	user);
	//assertTrue(issueService.saveIssue(issue));

//	}
	// @Test
		//void testGetIssueById() {

		// Issue issue = issueservice.getIssueById(103);
		// assertNotNull(issueservice.saveIssue(issue));

		// }

		// @Test
		// void testUpdateIssue() {
	//	Issue issue = new Issue(105, LocalDate.parse("2024-01-24"), LocalDate.parse("2024-02-24"), 'A', bookcopy,
	//	user);

		// boolean updatedissue = issueService.updateIssue(105);
		 //assertTrue(updatedissue);

		 //}

		// @Test

		// void testGetIssue() {

		// List<Issue> issueList = issueservice.getIssue(issue);
		// assertNotNull(issueList);

		// }

		// @Test
		// void testDeleteIssue() {
		// boolean success = issueservice.deleteIssue(104);
		// assertTrue(success);
		// assertNull(issueservice.getIssueById(104));
		// }
	@AfterAll
	static void tearDown() {
		sessionFactory.close();
	}
}

