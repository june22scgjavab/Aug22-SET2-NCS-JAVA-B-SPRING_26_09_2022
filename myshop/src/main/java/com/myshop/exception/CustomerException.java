package com.myshop.exception;

public class CustomerException extends Exception {
    public CustomerException(String message) {
    	super(message); // Parent class constructor is invoked.
    	// Here the parent class is Exception
    }
}
