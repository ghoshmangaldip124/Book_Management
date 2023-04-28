package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.bookservice.BookService;
import com.book.bookservice.CustomerService;
import com.book.entity.Book;
import com.book.entity.Customer;


@RestController
public class MyController {
	@Autowired
	private BookService bookservice;
	
	@PostMapping("/book")
	public Book addBook(@RequestBody Book book) {
		System.out.println("Book create succeesfully");
		return this.bookservice.addBook(book);
	}
	
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/book")
	public List<Book> getBook(){
		System.out.println("Book get successfully");
		return this.bookservice.getBook();
	}
	@GetMapping("/book/id/{id}")
	public Book getBookById(@PathVariable long id){
		return this.bookservice.getBookById(id);
	}
	@GetMapping("/book/name/{name}")
	public Book findBookByName(@PathVariable String name) {
		return this.bookservice.findBookByName(name);
	}
	
	@GetMapping("/book/price/{price}")
	public Book findBookByPrice(@PathVariable long price) {
		return this.bookservice.findBookByPrice(price);
	}
	@PutMapping("/book/{id}")
	public Book updateBookById(@PathVariable long id,@RequestBody Book student) {
		return this.bookservice.updateBookById(id, student);
	}
	@DeleteMapping("/book/{id}")
	public void deleteBookById(@PathVariable long id) {
		 this.bookservice.deleteBookById(id);
		 
	}
	
	@Autowired
	private CustomerService cser;
	
	@PostMapping("/cus")
	public Customer addCustomer(@RequestBody Customer customer) {
		System.out.println("Customer create succeesfully");
		return this.cser.addCustomer(customer);
	}
	
	
	@GetMapping("/cus")
	public List<Customer> getCustomer(){
		System.out.println("Customer get successfully");
		return this.cser.getCustomer();
	}
	@GetMapping("/cus/{cid}")
	public Customer getCustomerById(@PathVariable long cid) {
		return this.cser.getCustomerById(cid);
	}
	@PutMapping("/cus/{cid}")
	public Customer updateCustomerById(@PathVariable long cid,@RequestBody Customer customer) {
		return this.cser.updateCustomerById(cid, customer);
	}
	
	@DeleteMapping("/cus/{cid}")
	public void deleteCustomerById(@PathVariable long cid) {
		 this.cser.deleteCustomerById(cid);
		 
	}
	
}
