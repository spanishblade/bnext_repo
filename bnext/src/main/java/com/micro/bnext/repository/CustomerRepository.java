package com.micro.bnext.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.micro.bnext.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>  {

}
