package com.spring.security.and.jpa.enosis.preparation.repository;

import com.spring.security.and.jpa.enosis.preparation.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
	
	List<Customer> findByEmail(String email);

}