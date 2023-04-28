package com.book.bookserviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.bookservice.CustomerService;
import com.book.entity.Customer;
import com.book.repository.CustomerRepository;
@Service
public class CustomerserviceImpl implements CustomerService {

	@Autowired
	private CustomerRepository crepo;
	@Override
	public Customer addCustomer(Customer customer) {
		return crepo.save(customer);
	}

	@Override
	public Customer getCustomerById(long cid) {
		// TODO Auto-generated method stub
		return crepo.findById(cid).get();
	}

	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return crepo.findAll();
	}

	@Override
	public Customer updateCustomerById(long cid, Customer customer) {
		// TODO Auto-generated method stub
		customer.setCid(cid);
		return crepo.save(customer);
	}

	@Override
	public void deleteCustomerById(long cid) {
		// TODO Auto-generated method stub
		crepo.deleteById(cid);
	}

}
