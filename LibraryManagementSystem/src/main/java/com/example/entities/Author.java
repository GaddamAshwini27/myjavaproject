package com.example.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.ColumnDefault;

@Entity
public class Author {
	@Id
	int authorId; // primary key
	String name;

	@ColumnDefault("'A'")
	private char record_status;

	@ManyToMany(mappedBy = "authorSet")
	Set<Books> booksSet;

	// Default constructor
	public Author() {
	}

	public Author(int authorId, String name, char record_status) {
		super();
		this.authorId = authorId;
		this.name = name;
		this.record_status = record_status;

	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getRecord_status() {
		return record_status;
	}

	public void setRecord_status(char record_status) {
		this.record_status = record_status;
	}

	public Set<Books> getBooksSet() {
		return booksSet;
	}

	public void setBooksSet(Set<Books> booksSet) {
		this.booksSet = booksSet;
	}

}