package com.library.service;

import java.util.List;

import com.example.entities.BookCopy;

public interface BookCopyService {
	public  boolean saveBookcopy(BookCopy bookcopy);

	List<BookCopy> getBookCopy(BookCopy bookcopy);

	public void getBookcopyById(int Bookcopyid);

	public  boolean updateBookcopy(int BookcopyId);

	public  boolean deleteBookcopy(int BookcopyId);

}
