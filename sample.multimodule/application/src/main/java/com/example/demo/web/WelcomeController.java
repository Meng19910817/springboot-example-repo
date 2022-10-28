package com.example.demo.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Account;
import com.example.demo.service.api.AccountService;

@Controller
public class WelcomeController {
	
	@Value("${application.message:Hello World}")
	private String message;
	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		Account account = accountService.findOne("23");
		if(account == null) {
			model.put("message", "Error getting account!");
			model.put("account", "");
			return "welcome/show";
		}
		String accountInfo = "Your account number is ".concat(account.getNumber());
		model.put("message", this.message);
		model.put("account", accountInfo);
		return "welcome/show";
	}
	
	@RequestMapping("foo")
	public String foo(Map<String, Object> model) {
		throw new RuntimeException("Foo");
	}
}
