package com.example.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.example.dao.BookcopyDAO;
import com.example.entities.Author;
import com.example.entities.BookCopy;
import com.hibernateUtil.HibernateUtil;

public class BookcopyDAOImpl implements BookcopyDAO {
	private Session session;
	private SessionFactory sessionFactory;

	
	@Override
	    public boolean saveBookcopy(BookCopy bookcopy) {
	    	try(Session session=HibernateUtil.getSession()) {
	            Transaction tx = session.beginTransaction();
	            session.save(bookcopy);
	            tx.commit();
	    	
	        	return true;
	    	} catch (HibernateException e) {
		System.out.println("Hibernate Exception is :" + e);
	} catch (Exception e) {
		System.out.println("Exception is :" + e);
	}
	return false;
}
	    

	    @Override
	    public List<BookCopy> getBookCopy(BookCopy bookcopy) {
	    	try(Session session=HibernateUtil.getSession()) {
	            Query<BookCopy> query = session.createQuery("FROM Bookcopy WHERE name = :name", BookCopy.class);
	            query.setParameter("name", bookcopy.getShelfNo());
	            return query.getResultList();
	        }
	    }

	    @Override
	    public void getBookcopyById(int bookcopyId) {
	    	try(Session session=HibernateUtil.getSession()) {
	    		BookCopy bookcopy = session.get(BookCopy.class, bookcopyId);
	            if (bookcopy != null) {
	                System.out.println("Bookcopy found with ID: " + bookcopyId);
	                System.out.println("Bookcopy Name: " + bookcopy.getShelfNo());
	            } else {
	                System.out.println("Bookcopy not found with ID: " +bookcopyId);
	            }
	        }
	    }

	    @Override
	    public boolean updateBookcopy(int BookcopyId) {
	    	try(Session session=HibernateUtil.getSession()) {
	            Transaction tx = session.beginTransaction();
	            BookCopy bookcopy = session.get(BookCopy.class, BookcopyId); 
	            session.update(bookcopy);
	            tx.commit();
	    	  return true;
	    	}  catch (HibernateException e) {
	        		System.out.println("Hibernate Exception is :" + e);
	        	} catch (Exception e) {
	        		System.out.println("Exception is :" + e);
	        }
			return false;
	    }

	    @Override
	    public boolean deleteBookcopy(int bookcopyId) {
	    	try(Session session=HibernateUtil.getSession()) {
	            Transaction tx = session.beginTransaction();
	            BookCopy bookcopy = session.get(BookCopy.class, bookcopyId);
	            if (bookcopy != null) {
	                session.delete(bookcopy);
	                tx.commit();
	                return true;
	            } else {
	                System.out.println("Bookcopy not found with ID: " + bookcopyId);
	            }
	        }
			return false;
	    }
}
