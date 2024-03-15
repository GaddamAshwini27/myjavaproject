package com.library.service;

import java.util.List;

import com.example.entities.Issue;

public interface IssueService {
	public boolean saveIssue(Issue  issue);

	List<Issue> getIssue(Issue issue);

	public void getIssueById(int Issueid);

	public boolean updateIssue(int issueId);

	public boolean deleteIssue(int issueId);
	
}
