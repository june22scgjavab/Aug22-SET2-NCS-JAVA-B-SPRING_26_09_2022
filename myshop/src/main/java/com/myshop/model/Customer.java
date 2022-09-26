package com.myshop.model;

import java.time.LocalDate;

public class Customer {
private String customerId;
private String customerName;
private long mobileNumber;
private LocalDate dateOfBirth;



public Customer() {
	super();
	
}
public Customer(String customerId, String customerName, long mobileNumber, LocalDate dateOfBirth) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.mobileNumber = mobileNumber;
	this.dateOfBirth = dateOfBirth;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public long getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(long mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public LocalDate getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(LocalDate dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
	result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
	result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
	result = prime * result + (int) (mobileNumber ^ (mobileNumber >>> 32));
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Customer other = (Customer) obj;
	if (customerId == null) {
		if (other.customerId != null)
			return false;
	} else if (!customerId.equals(other.customerId))
		return false;
	if (customerName == null) {
		if (other.customerName != null)
			return false;
	} else if (!customerName.equals(other.customerName))
		return false;
	if (dateOfBirth == null) {
		if (other.dateOfBirth != null)
			return false;
	} else if (!dateOfBirth.equals(other.dateOfBirth))
		return false;
	if (mobileNumber != other.mobileNumber)
		return false;
	return true;
}
@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", mobileNumber=" + mobileNumber
			+ ", dateOfBirth=" + dateOfBirth + "]";
}

}
