package com.spring.security.and.jpa.enosis.preparation.repository;

import com.spring.security.and.jpa.enosis.preparation.entity.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
	
	
}
