package com.ajay.customer.controller;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajay.customer.model.Customer;
import com.ajay.customer.service.CustomerService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class CustomerController {

	@Autowired
	CustomerService Customerservice;

	// http://localhost:5555/api/v1/CreateCust

	@PostMapping("/CreateCust")
	public Customer createCustomer(@RequestBody Customer c) {
		return Customerservice.createCustomer(c);
	}

	// http://localhost:5555/api/v1/getAllCustomers
	@GetMapping("/getAllCustomers")
	List<Customer> getCustomerList() {
		return Customerservice.getAllCustomerInfo();
	}

	// http://localhost:5555/api/v1/getCustomer/

	@GetMapping("/getCustomer/{id}")
	public Customer getCustomer(@PathVariable Integer id) {
		return Customerservice.getCustomerById(id);
	}

	// http://localhost:5555/api/v1/delete/
	@DeleteMapping("/delete/{id}")
	String deleteCustomer(@PathVariable Integer id) {
		Customerservice.deleteCustomerById(id);
		return "Customer Deleted Successfully !";
	}
	// http://localhost:5555/customer/update/

	@PutMapping("/update/{id}")
	Customer updateCustomer(@RequestBody Customer c, @PathVariable Integer id) {
		return Customerservice.updateCustomerById(c, id);
	}

}
