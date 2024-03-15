package com.example.main;

import java.util.List;
import java.util.Scanner;

import com.example.entities.Author;
import com.example.entities.BookCopy;
import com.example.entities.Books;
import com.example.entities.Issue;
import com.example.entities.User;
import com.example.entities.WrittenBy;
import com.library.service.AuthorService;
import com.library.service.BookCopyService;
import com.library.service.BooksService;
import com.library.service.IssueService;
import com.library.service.UserService;
import com.library.service.WrittenByService;
import com.library.serviceImpl.AuthorServiceImpl;
import com.library.serviceImpl.BookCopyServiceImpl;
import com.library.serviceImpl.BooksServiceImpl;
import com.library.serviceImpl.IssueServiceImpl;
import com.library.serviceImpl.UserServiceImpl;
import com.library.serviceImpl.WrittenByServiceImpl;


public class AllOperations {

	static UserService userservice = new UserServiceImpl();
	static BooksService booksservice = new BooksServiceImpl();
	static BookCopyService bookcopyservice = new BookCopyServiceImpl();
	static AuthorService authorservice = new AuthorServiceImpl();
	static IssueService issueservice = new IssueServiceImpl();

	static Scanner scanner = new Scanner(System.in);

//User Details
	public static boolean userInput() {
		scanner.nextLine();
		System.out.println("Enter userId :");
		int userId = scanner.nextInt();
		System.out.println("Enter name :");
		String name = scanner.nextLine();
		System.out.println("Enter mobileNo :");
		String moblieNo = scanner.nextLine();
		System.out.println("Enter place:");
		String place = scanner.nextLine();
		System.out.println("enter record_Status");
		char record_status = (char) scanner.nextInt();
		System.out.println("Enter issueId :");
		int issueId = scanner.nextInt();
		
		Issue issue= new Issue(issueId);
		User user = new User( userId,name, moblieNo, place,record_status,issue);
       return userservice.saveUser(user);
	}
	public static void getUserId() {
		scanner.nextLine();
		System.out.println("enter user id");
		int id =scanner.nextInt();
		return userservice.getUserById(id);
	}
	public static List<User> getUser(User user){
		return userservice.getUser(user);
	}
	public static boolean updateUser(user) {
		System.out.println("Enter userId :");
		int userId = scanner.nextInt();
		System.out.println("Enter name :");
		String name = scanner.nextLine();
		System.out.println("Enter mobileNo :");
		String moblieNo = scanner.nextLine();
		System.out.println("Enter place:");
		String place = scanner.nextLine();
		
		User user = new User(userId,name, moblieNo, place);
		 
		return userservice.saveUserid(user, Id);
	}
	public static boolean deleteUser() {
		System.out.println("enter the Id");
		int userId =scanner.nextInt();
		return userservice.deleteUser(userId);
	}
	public static void userOperation() {
		System.out.println("User Operations:\n" + "1.Insert User datails:\n" + "2.list Uer details:\n"+
				"get User details:\n" + "4.update User details:\n"
	+ "5.delete the User details by id:");
	
	System.out.println("enter the input");
	int input = scanner.nextInt();
	switch(input) {
	case 1:
		userInput();
		break;
	case 2:
		getUserId();
		break;
	case 3:
		updateUser();
		break;
	case 4:
		deleteUser();
		break;
	}
	
	
	}
	
	
	
//Books Details
	public static boolean BooksInput() {
		scanner.nextLine();
		System.out.println("Enter BookId :");
		int bookId = scanner.nextInt();
		System.out.println("Enter Title :");
		String title = scanner.nextLine();
		System.out.println("Enter Price :");
		float price = scanner.nextFloat();
		System.out.println("Enter pub_name:");
		String pub_name = scanner.nextLine();
		System.out.println("Enter record_Status:");
		char record_status = (char) scanner.nextInt();
		System.out.println("Enter CopyId :");
		int copyId = scanner.nextInt();
		BookCopy bookcopy =new BookCopy(copyId);
		Books books = new Books(bookId, title, price, pub_name,record_status, bookcopy);
		return booksservice.saveBooks(books);
	}
	public static void getBooks(Books books) {
		scanner.nextLine();
		System.out.println("enter books id");
		int id =scanner.nextInt();
		return booksservice.getBooks(books);
	}
	public static List<Books> getBooks(Books books){
		return booksservice.getBooks(books);
	}
	public static boolean updateBooks(books) {
		System.out.println("Enter BookId :");
		int bookId = scanner.nextInt();
		System.out.println("Enter Title :");
		String title = scanner.nextLine();
		System.out.println("Enter Price :");
		float price = scanner.nextFloat();
		System.out.println("Enter pub_name:");
		String pub_name = scanner.nextLine();
		Books books = new Books(bookId, title, price, pub_name);
		return booksservice.saveBooks(books);
	}
	public static boolean deleteBooks() {
		System.out.println("enter the bookId");
		int bookId =scanner.nextInt();
		return booksservice.deleteBooks(bookId);
	}
	public static void BooksOperation() {
		System.out.println("Books Operations:\n" + "1.Insert Books datails:\n" + "2.list Books details:\n"+
				"get Books details:\n" + "4.update Books details:\n"
	+ "5.delete the Books details by id:");
	
	System.out.println("enter the input");
	int input = scanner.nextInt();
	switch(input) {
	case 1:
		userInput();
		break;
	case 2:
		getUserId();
		break;
	case 3:
		updateUser();
		break;
	case 4:
		deleteUser();
		break;
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//Bookcopy
	public static boolean  BookcopyInput() {
		scanner.nextLine();
		System.out.println("Enter copyId :");
		int bookcopyId = scanner.nextInt();
		System.out.println("Enter ShelfNo :");
		int shelfNo = scanner.nextInt();
		System.out.println("Enter record_Status:");
		char record_status = (char) scanner.nextInt();
		System.out.println("enter Bookid");
		int bookid=scanner.nextInt();
		
		
		Books books = new Books(bookid);
		BookCopy bookcopy = new BookCopy(bookcopyId,shelfNo, record_status, books);
		
		return bookcopyservice.saveBookcopy(bookcopy);
	}

//Author
	public static boolean  AuthorInput() {
		scanner.nextLine();
		System.out.println("Enter Aut_Id :");
		int aut_Id = scanner.nextInt();
		System.out.println("Enter Aut_name :");
		String aut_name = scanner.nextLine();
		System.out.println("Enter Aut_subject :");
		String aut_subject = scanner.nextLine();
		System.out.println("Enter Aut_qualification:");
		String Aut_qualification = scanner.nextLine();
		System.out.println("Enter record_Status:");
		char record_status = (char) scanner.nextInt();
		System.out.println("enter Aut_id");
		int aut_id=scanner.nextInt();
		
		Author author = new Author(aut_id,aut_name,aut_subject,Aut_qualification,record_status);
 
		
		return authorservice.saveAuthor(author);
		
	}

//Issue
	public static boolean issueInput() {
		scanner.nextLine();
		System.out.println("Enter issueId :");
		int issueId = scanner.nextInt();
		System.out.println("Enter issueDate :");
		int issueDate = scanner.nextInt();
		System.out.println("Enter returnDate :");
		int returnDate = scanner.nextInt();
		System.out.println("Enter record_Status:");
		char record_status = (char) scanner.nextInt();
		System.out.println("Enter CopyId :");
		int copyId = scanner.nextInt();
		BookCopy bookcopy=new BookCopy(copyId);
		Issue issue=new Issue(issueId,issueDate,returnDate,record_status, bookcopy);
		return issueservice.saveIssue(issue);
	}



	
}
	