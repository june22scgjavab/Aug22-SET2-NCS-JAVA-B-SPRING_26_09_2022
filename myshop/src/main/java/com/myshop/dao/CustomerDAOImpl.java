package com.myshop.dao;

import java.util.ArrayList;
import java.util.List;

import com.myshop.exception.CustomerException;
import com.myshop.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {
	private List<Customer> customerList = new ArrayList();

	// We have to add the customers to a List(ArrayList)
	public String addCustomer(Customer customer) throws CustomerException {

		customerList.add(customer);
		// We need to return the id of the customer which got added
		return customer.getCustomerId();
	}

	public List<Customer> displayCustomers() throws CustomerException {
		
		return customerList;
	}

}
