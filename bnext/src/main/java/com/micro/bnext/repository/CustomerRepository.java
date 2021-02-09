package com.micro.bnext.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.micro.bnext.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

//    /**
//     * Get list of objects.
//     *
//     * @return List<CustomerEntity>
//     */
//	public List<CustomerEntity> findAll();

    /**
     * Get object by id.
     *
     * @return CustomerEntity
     */
	public Customer findById(String id);

//    /**
//     * Create object.
//     *
//     * @return ResponseEntity<ResponseBase<Object>>
//     */
//	public String create(CustomerEntity entity);
//
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