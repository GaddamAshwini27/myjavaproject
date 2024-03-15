package com.library.service;

import java.util.List;

import com.example.entities.Author;

public interface AuthorService {
	
	public boolean saveAuthor(Author author);

	List<Author> getAuthor(Author author);

	public Author getAuthorById(int authorid);

	public  boolean updateAuthor(int authorId);

	public  boolean deleteAuthor(int authorId);

}
