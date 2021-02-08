package com.micro.bnext.repository;

import java.util.List;

import com.micro.bnext.model.CustomerEntity;

public interface CustomerRepository {

    /**
     * Get list of objects.
     *
     * @return List<CustomerEntity>
     */
	public List<CustomerEntity> findAll();

    /**
     * Get object by id.
     *
     * @return CustomerEntity
     */
	public CustomerEntity findById(String id);

    /**
     * Create object.
     *
     * @return ResponseEntity<ResponseBase<Object>>
     */
	public String create(CustomerEntity entity);

    /**
     * Update object by id.
     *
     */
	public void update(CustomerEntity entity);
	
    /**
     * Delete object by id.
     *
     */
	public void deleteById(String id);
}