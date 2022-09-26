package com.myshop.service;

import java.util.List;

import com.myshop.exception.CustomerException;
import com.myshop.model.Customer;

public interface CustomerService {
	public String addCustomer(Customer customer) throws CustomerException;
    public List<Customer> displayCustomers() throws CustomerException;
}
