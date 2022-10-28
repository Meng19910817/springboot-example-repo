package com.example.demo.service.api;

import com.example.demo.entity.Account;

public interface AccountService {

	/**
	 * Find an account by number
	 * @param number
	 * @return
	 * @throws AccountNotFoundException
	 */
	Account findOne(String number) throws AccountNotFoundException;
	
	/**
	 * Create an account by number
	 * @param number
	 * @return
	 */
	Account createAccountByNumber(String number);
	
}
