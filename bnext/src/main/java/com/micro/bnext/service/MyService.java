package com.micro.bnext.service;

import java.util.List;
import java.util.Optional;

import com.micro.bnext.model.Customer;

public interface MyService {

    /**
     * Get list of customer.
     *
     * @return List<Customer>
     */
	public List<Customer> findAll();

    /**
     * Get object by id.
     *
     * @return Optional<Customer>
     */
	public Optional<Customer> findById(String id);

    /**
     * Create customer.
     *
     * @return Customer
     */
	public Customer create(Customer customer);

    /**
     * Update object by id.
     *
     */
	public void update(String id, Customer customer);
	
    /**
     * Delete object by id.
     *
     */
	public void delete(String id);
}
