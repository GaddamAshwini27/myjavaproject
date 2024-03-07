package com.example.entities;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import antlr.collections.List;

@Entity
public class Books {
	@Id
	int bookid;
	String Title;
	Float price;
	String Pub_name;
	
	@ManyToOne
	Books books;
	
	@ManyToOne
	BookCopy bookCopy;

	public Books(int bookid, String title, Float price, String pub_name, Books books, BookCopy bookCopy) {
		super();
		this.bookid = bookid;
		Title = title;
		this.price = price;
		Pub_name = pub_name;
		this.books = books;
		this.bookCopy = bookCopy;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getPub_name() {
		return Pub_name;
	}

	public void setPub_name(String pub_name) {
		Pub_name = pub_name;
	}

	public Books getBooks() {
		return books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}

	public BookCopy getBookCopy() {
		return bookCopy;
	}

	public void setBookCopy(BookCopy bookCopy) {
		this.bookCopy = bookCopy;
	}
	
}