package com.spring.security.and.jpa.enosis.preparation.controller;

import com.spring.security.and.jpa.enosis.preparation.entity.Customer;
import com.spring.security.and.jpa.enosis.preparation.entity.Loans;
import com.spring.security.and.jpa.enosis.preparation.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoansController {
	@Autowired
	private LoanRepository loanRepository;

	@PostMapping("/myLoans")
	public List<Loans> getLoanDetails(@RequestBody Customer customer) {
		List<Loans> loans = loanRepository.findByCustomerIdOrderByStartDtDesc(customer.getId());
		if (loans != null ) {
			return loans;
		}else {
			return null;
		}
	}
}
