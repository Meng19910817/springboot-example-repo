package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;

@RestController
public class CustomerController {

	@RequestMapping("/")
	@Cacheable(value="customerInfo")
	public List<Customer> customerInformation() {
		// The first responses would print ====customer information====,
		// then cache the result to customerInfo.
		// The second response would not print sout.
		System.out.println("======customer information======");
		List<Customer> detail =  Arrays.asList(new Customer(5126890,"Charlie Puth","Current A/c", 450000.00),
                new Customer(7620015,"Andrew Flintoff","Saving A/c", 210089.00)
               );
		return detail;
	}
}
