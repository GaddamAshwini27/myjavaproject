package com.example.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.example.dao.IssueDAO;
import com.example.entities.Issue;
import com.hibernateUtil.HibernateUtil;

public class IssueDAOImpl implements IssueDAO {
	SessionFactory sessionFactory;

	@Override
	public boolean saveIssue(Issue issue) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction transaction = session.beginTransaction();
			session.save(issue);
			transaction.commit();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public void getIssueById(int issueId) {
		try (Session session = HibernateUtil.getSession()) {

		} catch (Exception ex) {
			ex.printStackTrace();

		}
	}

	@Override
	public boolean updateIssue(int issueid) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction transaction = session.beginTransaction();
			session.update(issueid);
			transaction.commit();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteIssue(int issueId) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction transaction = session.beginTransaction();
			Issue issue = session.get(Issue.class, issueId);
			if (issue != null) {
				session.delete(issue);
				return true;
			}
			transaction.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Issue> getIssue(Issue issue) {
		try (Session session = HibernateUtil.getSession()) {

			return session.createQuery("from Issue where field = :issuedate", Issue.class)
					.setParameter("value", issue.getIssueDate()).getResultList();
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
}
