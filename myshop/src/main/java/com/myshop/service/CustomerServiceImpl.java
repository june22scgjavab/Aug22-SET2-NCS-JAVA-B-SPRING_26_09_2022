package com.myshop.service;

import java.util.List;

import com.myshop.dao.CustomerDAO;
import com.myshop.dao.CustomerDAOImpl;
import com.myshop.exception.CustomerException;
import com.myshop.model.Customer;
import com.myshop.service.validator.Validator;

public class CustomerServiceImpl implements CustomerService {
// We should create a reference variable of interface
// and object of the class which has implemented the interface
	private CustomerDAO customerDAO=new CustomerDAOImpl();
	
	public String addCustomer(Customer customer) throws CustomerException {
		Validator validate=new Validator();
		validate.validate(customer);
		return customerDAO.addCustomer(customer);
	}

	public List<Customer> displayCustomers() throws CustomerException {
		if(customerDAO.displayCustomers().isEmpty())
		{
			throw new CustomerException("The List is empty");
		}
		return customerDAO.displayCustomers();
	}

}
