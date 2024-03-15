package com.library.serviceImpl;

import java.util.List;

import com.example.dao.BookcopyDAO;
import com.example.daoImpl.BookcopyDAOImpl;
import com.example.entities.BookCopy;
import com.library.service.BookCopyService;

public class BookCopyServiceImpl implements BookCopyService {
	BookcopyDAO bookcopydao = new BookcopyDAOImpl();

	public  boolean saveBookcopy(BookCopy bookcopy) {
		return bookcopydao.saveBookcopy(bookcopy);
	}

	public List<BookCopy> getBookCopy(BookCopy bookcopy) {
		return bookcopydao.getBookCopy(bookcopy);
	}

	public void getBookcopyById(int Bookcopyid) {
		bookcopydao.getBookcopyById(Bookcopyid);
	}

	public  boolean updateBookcopy(int BookcopyId) {
		return bookcopydao.updateBookcopy(BookcopyId);

	}

	public  boolean deleteBookcopy(int BookcopyId) {
		return bookcopydao.deleteBookcopy(BookcopyId);

	}
}
