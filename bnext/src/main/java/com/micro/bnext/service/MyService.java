package com.micro.bnext.service;

import java.util.List;

import com.micro.bnext.model.CustomerEntity;

public interface MyService {

    /**
     * Get list of objects.
     *
     * @return List<Object>
     */
	public List<CustomerEntity> findAll();

    /**
     * Get object by id.
     *
     * @return CustomerDto
     */
	public CustomerEntity findById(String id);

    /**
     * Create object.
     *
     * @return ResponseEntity<ResponseBase<Object>>
     */
	public Long create(Object resource);

    /**
     * Update object by id.
     *
     * @return ResponseEntity<ResponseBase<Object>>
     */
	public void update(Object resource);
	
    /**
     * Delete object by id.
     *
     * @return ResponseEntity<ResponseBase<Object>>
     */
	public void deleteById(String id);

}
