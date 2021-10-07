package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;

@Service
public class BookService {

	@Autowired
	private Book book;
	
	public Book getBookId(int id) {
		book.setBookId(202);
		book.setBookName("Head First Java");
		book.setAuthor("Kathy Sieera");
		if(id==1) {
			book.setBookId(203);
			book.setBookName("Effective Java");
			book.setAuthor("Bruce Erickle");
		}
		
		return this.book;
	}
}
