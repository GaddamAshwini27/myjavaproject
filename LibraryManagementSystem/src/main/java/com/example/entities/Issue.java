package com.example.entities;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ColumnDefault;


@Entity
public class Issue {
	@Id
	int issueId;
	LocalDate issueDate;
	LocalDate returnDate;

	@ColumnDefault("'A'")
	private char record_status;

	@ManyToOne // multiple issues associated with particular bookcopy
	BookCopy bookcopy; // relation between Issue and bookcopy

	@ManyToOne
	User user;

	public Issue() {
	}

	public Issue(int issueId, LocalDate issueDate, LocalDate returnDate, char record_status, BookCopy bookcopy,
			User user) {
		super();
		this.issueId = issueId;
		this.issueDate = issueDate;
		this.returnDate = returnDate;
		this.record_status = record_status;
		this.bookcopy = bookcopy;
		this.user = user;
	}

	public int getIssueId() {
		return issueId;
	}

	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}

	public char getRecord_status() {
		return record_status;
	}

	public void setRecord_status(char record_status) {
		this.record_status = record_status;
	}

	public BookCopy getBookcopy() {
		return bookcopy;
	}

	public void setBookcopy(BookCopy bookcopy) {
		this.bookcopy = bookcopy;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
