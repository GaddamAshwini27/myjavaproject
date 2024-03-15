package com.example.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.ColumnDefault;






@Entity
public class Books {
	@Id
	int bookId; // primary key
	String title;
	double price;
	String publisherName;

	@ColumnDefault("'A'")
	private char record_status;

	@ManyToMany(cascade = CascadeType.ALL)
	Set<Author> authorSet;

	public Books() {
	}

	public Books(int bookId, String title, double price, String publisherName, char record_status,
			Set<Author> authorSet) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
		this.publisherName = publisherName;
		this.record_status = record_status;
		this.authorSet = authorSet;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public char getRecord_status() {
		return record_status;
	}

	public void setRecord_status(char record_status) {
		this.record_status = record_status;
	}

	public Set<Author> getAuthorSet() {
		return authorSet;
	}

	public void setAuthorSet(Set<Author> authorSet) {
		this.authorSet = authorSet;
	}

}
