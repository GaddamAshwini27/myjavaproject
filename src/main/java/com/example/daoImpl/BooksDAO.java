package com.example.daoImpl;
import java.util.List;

import javax.persistence.EntityTransaction;


import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.example.entities.Books;
public class BooksDAO {

	

	

	public class BookDAO {
		private Session  session;
		public BookDAO(final Session session) {
			this.session = session;
		}
		
		// Save books Details
		public void saveBook(Books b) {
			try {
				session.beginTransaction();
				session.save(b);
				session.getTransaction().commit();
				
				session.clear();
				
				
			} catch(HibernateException e) {
				System.out.println("Hibernate Exception:" + e);
				
			}catch(Exception e) {
				System.out.println("Exception:" + e);
			}
			
				}//end 
		
		public List<Books> findAllEmployee(){
			List<Employee> employee = session.createQuery("from Employee",Employee.class).getResultList();
			return employee;
		}//end
		public Employee findEmployeeById(int id) {
			try {
				Employee employee = session.get(Employee.class, id);
				return employee;
			}catch(HibernateException e)
			{
				System.out.println("Hibernate exception is: "+e);
				}
				catch(Exception e)
				{
				System.out.println("Exception is: "+e);
				}
				return null;
		} // end 
		
		//to update Employee by Employee id
		public Employee updateEmployeeById(int id,Employee employee) {
			try
			{
				Employee existEmployee = session.load(Employee.class,id);
				existEmployee.setName(employee.getName());
				existEmployee.setEmail(employee.getEmail());
				session.beginTransaction();
				session.saveOrUpdate(existEmployee);
				session.getTransaction().commit();
				return existEmployee;
			}catch(HibernateException e)
			{
				System.out.println("Hibernate exception is: "+e);
				}
				catch(Exception e)
				{
				System.out.println("Exception is: "+e);
				}
				return null;
		}// end
		
		//to remove Employee by  id
		public void removeEmpleyeeById(int id) {
			try
			{
				Employee employee = session.get(Employee.class, id);
				session.beginTransaction();
				if(employee != null) {
					session.delete(employee);
				}
				else
				{
					System.out.println("Student details not found!!");
				}
					
			}
		catch(HibernateException e)
		{
			System.out.println("Hibernate exception is: "+e);
			}
			catch(Exception e)
			{
			System.out.println("Exception is: "+e);
			}
			
		}//end
		
		
		//removing all Employee records from the database
	  public void removeAll() {
		  List<Employee> employee = findAllEmployee();
		  
		  for(Employee e: employee) {
			  EntityTransaction tnx = null;
			  
			  try
			  {
				  tnx = session.getTransaction();
				  
				  if(!tnx.isActive()) {
					  tnx.begin();
				  }
				  session.remove(e);
				  tnx.commit();
			  }catch(HibernateException ex)
				{
					System.out.println("Hibernate exception is: "+e);
					}
					catch(Exception ex)
					{
					System.out.println("Exception is: "+ex);
					}
		  }
	  }
		
	}
}
