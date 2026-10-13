package com.ajay.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajay.customer.model.Customer;
import com.ajay.customer.repository.CustomerRepo;

@Service
public class CustomerServiceImp implements CustomerService{
	@Autowired
	CustomerRepo customerRepo;

	
	public Customer createCustomer( Customer c) {
		
		return customerRepo.save(c);
	}
	
	public List<Customer> getAllCustomerInfo() {
		return customerRepo.findAll();
	}
	
	public Customer getCustomerById(Integer id) {
		return customerRepo.findById(id).get();
	}
	
	
	public void deleteCustomerById(Integer id) {
		customerRepo.deleteById(id);
		
	}

	public Customer updateCustomerById(Customer c,Integer id) {
		
		Customer custDB=getCustomerById(id);
		custDB.setAge(c.getAge());
		custDB.setCname(c.getCname());
		custDB.setCity(c.getCity());
		custDB.setPhoneNumber(c.getPhoneNumber());
		custDB.setState(c.getState());
		return customerRepo.save(custDB);
	}


		

}
