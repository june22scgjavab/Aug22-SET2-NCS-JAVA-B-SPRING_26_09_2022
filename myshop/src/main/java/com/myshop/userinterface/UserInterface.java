package com.myshop.userinterface;

import java.time.LocalDate;
import java.util.List;

import com.myshop.exception.CustomerException;
import com.myshop.model.Customer;
import com.myshop.service.CustomerService;
import com.myshop.service.CustomerServiceImpl;

public class UserInterface {

	private static CustomerService customerService = new CustomerServiceImpl();

	public static void main(String[] args) {
		// 1) ADD CUSTOMERS
		addCustomers();
		// 2) DISPLAY CUSTOMERS
		displayCustomers();

	}

	private static void displayCustomers() {

		try {
			List<Customer> customerList = customerService.displayCustomers();
			for (Customer customer : customerList) {
				System.out.println(customer.getCustomerId() + " " + customer.getCustomerName());

			}
		} catch (CustomerException e) {

			System.out.println(e.getMessage());
		}

	}

	private static void addCustomers() {

		Customer customer = new Customer("C001", "Ravi", 987654321L, LocalDate.of(2000, 10, 15));
		String str;
		try {
			str = customerService.addCustomer(customer);
			System.out.println(str);
		} catch (CustomerException e) {
			System.out.println(e.getMessage());
		}

	}

}
