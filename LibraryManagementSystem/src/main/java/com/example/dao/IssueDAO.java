package com.example.dao;

import java.util.List;

import com.example.entities.Author;
import com.example.entities.Issue;

public interface IssueDAO {
	public boolean saveIssue(Issue  issue);

	List<Issue> getIssue(Issue issue);

	public void getIssueById(int Issueid);

	public boolean updateIssue(int issueId);

	public boolean deleteIssue(int issueId);
	

}
