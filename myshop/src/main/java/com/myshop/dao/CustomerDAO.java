package com.myshop.dao;

import java.util.List;

import com.myshop.exception.CustomerException;
import com.myshop.model.Customer;

public interface CustomerDAO {

	
	public String addCustomer(Customer customer) throws CustomerException;
    public List<Customer> displayCustomers() throws CustomerException;
    
}
