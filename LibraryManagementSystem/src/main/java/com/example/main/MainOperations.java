package com.example.main;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.entities.Author;
import com.example.entities.BookCopy;
import com.example.entities.Issue;
import com.example.entities.User;

public class MainOperations {
	public static void main(String[] args) {
	

	static Scanner scanner = new Scanner(System.in);

	while(true)
	{
		System.out.println("Welcome to LibraryManagementSystem:\n" + "1.User Details\n" + "2.Books Details\n"
				+ "3.Bookcopy Details\n" + "4.Author Details\n" + "5.Issue Details\n" + "6.WrittenBy Details\n");

		int input = scanner.nextInt();
		switch (input) {
		case 1:
			AllOperations.UserOperations();
			System.out.println("==============================================");
			break;
		case 2:
			AllOperations.BooksOperations();
			System.out.println("==============================================");
			break;
		case 3:
			AllOperations.BookcopyOperations();
			System.out.println("==============================================");
			break;
		case 4:
			AllOperations.AuthorOperations();
			System.out.println("==============================================");
			break;
		case 5:
			AllOperations.IssueOperations();
			System.out.println("==============================================");
			break;
		case 6:
			AllOperations.WrittenbyOperations();
			System.out.println("==============================================");
			break;
		}
	}
}
}