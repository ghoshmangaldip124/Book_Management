package com.book.bookservice;

import java.util.List;

import com.book.entity.Customer;


public interface CustomerService {
	///CURD opration service layer for book
		public Customer addCustomer(Customer customer);
		public Customer getCustomerById(long cid);
		public List<Customer>getCustomer();
		public Customer updateCustomerById(long cid, Customer customer);
		public void deleteCustomerById(long cid);
}
