package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ColumnDefault;

@Entity
public class BookCopy {
	@Id
	int copyId;
	int shelfNo;

	@ColumnDefault("'A'")
	private char record_status;

	@ManyToOne // bookcopies belongs to single book
	Books books; // relation between bookcopy and books

	public BookCopy() {
	}

	public BookCopy(int copyId, int shelfNo, char record_status, Books books) {
		super();
		this.copyId = copyId;
		this.shelfNo = shelfNo;
		this.record_status = record_status;
		this.books = books;
	}

	public int getCopyId() {
		return copyId;
	}

	public void setCopyId(int copyId) {
		this.copyId = copyId;
	}

	public int getShelfNo() {
		return shelfNo;
	}

	public void setShelfNo(int shelfNo) {
		this.shelfNo = shelfNo;
	}

	public char getRecord_status() {
		return record_status;
	}

	public void setRecord_status(char record_status) {
		this.record_status = record_status;
	}

	public Books getBooks() {
		return books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}

}
