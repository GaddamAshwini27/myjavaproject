package com.example.entities;

import javax.persistence.ManyToOne;

public class Issue {
	int issueDate;
	int returnDate;

	@ManyToOne
	Issue issue;

	@ManyToOne
	BookCopy bookcopy;
	
	public Issue() {}

	public int getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(int issueDate) {
		this.issueDate = issueDate;
	}

	public int getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(int returnDate) {
		this.returnDate = returnDate;
	}

	public Issue getIssue() {
		return issue;
	}

	public void setIssue(Issue issue) {
		this.issue = issue;
	}

	public BookCopy getBookcopy() {
		return bookcopy;
	}

	public void setBookcopy(BookCopy bookcopy) {
		this.bookcopy = bookcopy;
	}

	public Issue(int issueDate, int returnDate, Issue issue, BookCopy bookcopy) {
		super();
		this.issueDate = issueDate;
		this.returnDate = returnDate;
		this.issue = issue;
		this.bookcopy = bookcopy;
	}

}
