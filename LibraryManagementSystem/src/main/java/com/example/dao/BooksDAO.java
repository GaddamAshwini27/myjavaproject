package com.example.dao;

import java.util.List;

import com.example.entities.Books;

public interface BooksDAO {
	public boolean saveBooks(Books books);

	List<Books> getBooks(Books books);

	public void getBooksById(int Booksid);

	public boolean updateBooks(int BooksId);

	public boolean deleteBooks(int BooksId);
}
