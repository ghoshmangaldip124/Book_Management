package com.book.bookserviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.bookservice.BookService;
import com.book.entity.Book;
import com.book.repository.BookRepository;

@Service
public class BookserviceImpl implements BookService {

	//book repository
		@Autowired
		private BookRepository bookrepo;
	
		//create book
	@Override
	public Book addBook(Book book) {
		return bookrepo.save(book);
		
	}

	//get book id
	@Override
	public Book getBookById(long id) {
		return bookrepo.findById(id).get();
	}

	//all book details
	@Override
	public List<Book> getBook() {
		return bookrepo.findAll();
	}

	//find by book in name
	@Override
	public Book findBookByName(String name) {
		return bookrepo.findBookByname(name);
	}

	//find by book price
	@Override
	public Book findBookByPrice(long price) {
		return bookrepo.findBookByprice(price);
	}

	//find by book id && update
	@Override
	public Book updateBookById(long id, Book book) {
		book.setId(id);
		return bookrepo.save(book);
	}

	
	//delete by id
	@Override
	public void deleteBookById(long id) {
		bookrepo.deleteById(id);
	}


}
