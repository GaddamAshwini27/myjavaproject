package com.library.serviceImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.dao.BooksDAO;
import com.example.daoImpl.BooksDAOImpl;
import com.example.entities.Books;
import com.library.service.BooksService;

public class BooksServiceImpl implements BooksService {

	BooksDAO booksdao = new BooksDAOImpl();

	@Override
	public  boolean saveBooks(Books books) {
		return booksdao.saveBooks(books);

	}

	@Override
	public List<Books> getBooks(Books books) {
		return booksdao.getBooks(books);
	}

	@Override
	public void getBooksById(int Booksid) {
		booksdao.getBooksById(Booksid);

	}

	@Override
	public  boolean updateBooks(int BooksId) {
		return booksdao.updateBooks(BooksId);

	}

	@Override
	public  boolean deleteBooks(int BooksId) {
		return booksdao.deleteBooks(BooksId);

	}

}
