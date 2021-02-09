package com.micro.bnext.service;

import java.util.List;
import java.util.Optional;

import com.micro.bnext.model.Customer;

public interface MyService {

    /**
     * Get list of objects.
     *
     * @return List<CustomerEntity>
     */
	public List<Customer> findAll();

    /**
     * Get object by id.
     *
     * @return CustomerEntity
     */
	public Optional<Customer> findById(String id);

    /**
     * Create object.
     *
     * @return ResponseEntity<ResponseBase<Object>>
     */
	public Customer create(Customer entity);

//    /**
//     * Update object by id.
//     *
//     */
//	public void update(CustomerEntity entity);
//	
//    /**
//     * Delete object by id.
//     *
//     */
//	public void deleteById(String id);
}
