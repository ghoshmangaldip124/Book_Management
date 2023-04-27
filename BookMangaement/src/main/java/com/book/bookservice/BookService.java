package com.book.bookservice;

import java.util.List;


import com.book.entity.Book;

public interface BookService {
	///CURD opration service layer for book
	public Book addBook(Book book);
	public Book getBookById(long id);
	public List<Book>getBook();
	public Book updateBookById(long id, Book student);
	public void deleteBookById(long id);	

	//cusotomize method
	public Book findBookByName(String name);
	public Book findBookByPrice(long price);
}
