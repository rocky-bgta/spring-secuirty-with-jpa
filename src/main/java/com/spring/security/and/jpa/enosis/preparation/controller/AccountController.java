package com.spring.security.and.jpa.enosis.preparation.controller;

import com.spring.security.and.jpa.enosis.preparation.entity.Accounts;
import com.spring.security.and.jpa.enosis.preparation.entity.Customer;
import com.spring.security.and.jpa.enosis.preparation.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	@Autowired
	private AccountsRepository accountsRepository;

	@PostMapping("/myAccount")
	public Accounts getAccountDetails(@RequestBody Customer customer) {
		Accounts accounts = accountsRepository.findByCustomerId(customer.getId());
		if (accounts != null ) {
			return accounts;
		}else {
			return null;
		}
	}

}
