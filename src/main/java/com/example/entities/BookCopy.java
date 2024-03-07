package com.example.entities;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import antlr.collections.List;

@Entity
public class BookCopy {
	@Id
	int copyid;
	int shelfNo;
	
	@ManyToOne
	BookCopy bookCopy;
	
	@ManyToOne
	Books books;
	
	public BookCopy() {}

	public BookCopy(int copyid, int shelfNo, BookCopy bookCopy, Books books) {
		super();
		this.copyid = copyid;
		this.shelfNo = shelfNo;
		this.bookCopy = bookCopy;
		this.books = books;
	}

	public int getCopyid() {
		return copyid;
	}

	public void setCopyid(int copyid) {
		this.copyid = copyid;
	}

	public int getShelfNo() {
		return shelfNo;
	}

	public void setShelfNo(int shelfNo) {
		this.shelfNo = shelfNo;
	}

	public BookCopy getBookCopy() {
		return bookCopy;
	}

	public void setBookCopy(BookCopy bookCopy) {
		this.bookCopy = bookCopy;
	}

	public Books getBooks() {
		return books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}
}
	
	
