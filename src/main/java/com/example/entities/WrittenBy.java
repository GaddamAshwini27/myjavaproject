package com.example.entities;

import javax.persistence.ManyToOne;

public class WrittenBy {
int Aut_Id;
int bookId;

@ManyToOne
WrittenBy writtenBy;

@ManyToOne
Books books;

public WrittenBy() {}

public WrittenBy(int aut_Id, int bookId, WrittenBy writtenBy, Books books) {
	super();
	Aut_Id = aut_Id;
	this.bookId = bookId;
	this.writtenBy = writtenBy;
	this.books = books;
}

public int getAut_Id() {
	return Aut_Id;
}

public void setAut_Id(int aut_Id) {
	Aut_Id = aut_Id;
}

public int getBookId() {
	return bookId;
}

public void setBookId(int bookId) {
	this.bookId = bookId;
}

public WrittenBy getWrittenBy() {
	return writtenBy;
}

public void setWrittenBy(WrittenBy writtenBy) {
	this.writtenBy = writtenBy;
}

public Books getBooks() {
	return books;
}

public void setBooks(Books books) {
	this.books = books;
}
}
