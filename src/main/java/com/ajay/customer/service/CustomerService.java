package com.ajay.customer.service;

import java.util.List;

import com.ajay.customer.model.Customer;

public interface CustomerService {
	
	
	
	Customer createCustomer(Customer c);
	
    List<Customer>getAllCustomerInfo();
     
    Customer getCustomerById(Integer id);
     
    Customer updateCustomerById(Customer c, Integer id);
    
    void deleteCustomerById(Integer id);
}
