package com.library.serviceImpl;

import java.util.List;

import com.example.dao.AuthorDAO;
import com.example.daoImpl.AuthorDAOImpl;
import com.example.entities.Author;
import com.library.service.AuthorService;

public class AuthorServiceImpl implements AuthorService {

	AuthorDAO authordao = new AuthorDAOImpl();

	public  boolean saveAuthor(Author author) {
		return authordao.saveAuthor(author);

	}

	public List<Author> getAuthor(Author author) {

		return authordao.getAuthor(author);
	}

	public Author getAuthorById(int authorid) {
		return authordao.getAuthorById(authorid);
		
	}

	public  boolean updateAuthor(int authorId) {
		return authordao.updateAuthor(authorId);

	}

	public  boolean deleteAuthor(int authorId) {
		return authordao.deleteAuthor(authorId);
	}

}