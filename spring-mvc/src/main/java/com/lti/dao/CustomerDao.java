package com.lti.dao;	//use lti.repository

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Customer;

@Repository
public class CustomerDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void add(Customer customer) {
		entityManager.persist(customer);
	}

}
