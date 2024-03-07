package com.example.dao;

import java.util.List;

import com.example.entities.Author;
import com.example.entities.User;

public interface AuthorDAO {
	public void saveAuthor(Author author);

	List<Author> getAuthor(Author author);

	public void getAuthorrById(int authorid);

	public void updateAuthor(int authorId);

	public void deleteAuthor(int authorId);

}
