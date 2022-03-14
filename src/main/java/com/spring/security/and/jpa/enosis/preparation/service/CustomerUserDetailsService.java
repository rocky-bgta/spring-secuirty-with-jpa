package com.spring.security.and.jpa.enosis.preparation.service;

import com.spring.security.and.jpa.enosis.preparation.config.SecurityCustomer;
import com.spring.security.and.jpa.enosis.preparation.entity.Customer;
import com.spring.security.and.jpa.enosis.preparation.repository.CustomerRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerUserDetailsService implements UserDetailsService {

	private final CustomerRepository customerRepository;

	public CustomerUserDetailsService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		List<Customer> customer = customerRepository.findByEmail(username);
		if (customer.size() == 0) {
			throw new UsernameNotFoundException("User details not found for the user : " + username);
		}
		return new SecurityCustomer(customer.get(0));
	}

}