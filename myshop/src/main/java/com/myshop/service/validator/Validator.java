package com.myshop.service.validator;

import java.time.LocalDate;
import com.myshop.exception.CustomerException;
import com.myshop.model.Customer;

public class Validator {
	/*
	 * Validate method in turn will call or invoke boolean validateId(String
	 * customerId) boolean validateName(String customerName) boolean
	 * validateMobileNumber(long mobileNumber) boolean validateDob(LocalDate dob)
	 * and if all the members are validated successfully. it will return nothing but
	 * if we have error with any one of the data it will throw CustomerException (
	 * User defined one)
	 * 
	 */

	public void validate(Customer customer) throws CustomerException {
		String errorMessage = ""; // empty string
		if (!validateId(customer.getCustomerId())) {
			errorMessage += "Id should start with C followed by 3 digits";
		}

		if (!validateName(customer.getCustomerName())) {
			errorMessage += "Name should start with uppercase and can have firstname,middlename and lastname or firstname and lastname";
		}

		if (!validateMobileNumber(customer.getMobileNumber())) {
			errorMessage += "Mobile number should have 10 digits";
		}
		if (!validateDob(customer.getDateOfBirth())) {
			errorMessage += "Mobile number should have 10 digits";
		}
        if(!errorMessage.isEmpty()) {
        	throw new CustomerException(errorMessage);
        }
	}

	// customerId should start with C followed by 3 digits
	// Invalid escape sequence (valid ones are \b \t \n \f \r \" \' \\ )
	boolean validateId(String customerId) {
		String regex = "C\\d{3}";
		if (customerId.matches(regex)) {
			return true;
		}
		// return customerId.matches(regex);
		// return custmerId.matches(regex)?true:false;
		return false;

	}

	// Name will have firstname middlename lastname
	// firstname lastname
	// First character of all the name parts should be in uppercase
	boolean validateName(String customerName) {
		String regex = "([A-Z][a-z]+)(\\s[A-Z][a-z]+){1,2}";
		return customerName.matches(regex) ? true : false;

	}

	// Should be of 10 digits
	boolean validateMobileNumber(long mobileNumber) {
		String strMobile = String.valueOf(mobileNumber);
		return strMobile.length() == 10 ? true : false;
	}

	// dob should be less than current date
	boolean validateDob(LocalDate dob) {
		LocalDate today = LocalDate.now();
		return dob.isBefore(today) ? true : false;
	}

}
