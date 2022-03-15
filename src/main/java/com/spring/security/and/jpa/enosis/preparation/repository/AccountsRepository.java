package com.spring.security.and.jpa.enosis.preparation.repository;

import com.spring.security.and.jpa.enosis.preparation.entity.Accounts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends CrudRepository<Accounts, Long> {
	
	Accounts findByCustomerId(int customerId);

}
