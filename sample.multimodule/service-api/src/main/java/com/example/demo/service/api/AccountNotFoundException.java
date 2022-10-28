package com.example.demo.service.api;

public class AccountNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 7961546630140700671L;
	
	public AccountNotFoundException(String accountId) {
		super("No such account with id: " + accountId);
	}

}
