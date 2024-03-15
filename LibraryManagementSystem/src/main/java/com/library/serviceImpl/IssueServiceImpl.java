package com.library.serviceImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.example.dao.IssueDAO;
import com.example.daoImpl.IssueDAOImpl;
import com.example.entities.Issue;
import com.library.service.IssueService;

public class IssueServiceImpl implements IssueService {
	IssueDAO issuedao = new IssueDAOImpl();

	@Override
	public  boolean saveIssue(Issue issue) {
		return issuedao.saveIssue(issue);

	}


	@Override
	public  boolean updateIssue(int issueId) {
		return issuedao.updateIssue(issueId);

	}

	@Override
	public  boolean deleteIssue(int issueId) {
		return issuedao.deleteIssue(issueId);

	}


	@Override
	public List<Issue> getIssue(Issue issue) {
		return issuedao.getIssue(issue);
		
	}


	@Override
	public void getIssueById(int Issueid) {
		issuedao.getIssueById(Issueid);
		
	}

	

	

}
