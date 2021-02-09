package com.micro.bnext.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.micro.bnext.model.Customer;
import com.micro.bnext.repository.CustomerRepository;
import com.micro.bnext.service.MyService;

@Component
public class MyServiceImpl implements MyService{

	@Autowired
	CustomerRepository customerRepository;
	
//	@Override
//	public List<Customer> findAll() {
//		return customerRepository.findAll();
//	}

	@Override
	public Customer findById(String id) {
		return customerRepository.findById(id);
	}

//	@Override
//	public String create(Customer entity) {
//		return customerRepository.create(entity);
//	}
//
//	@Override
//	public void update(Customer entity) {
//		customerRepository.update(entity);
//	}
//	
//	@Override
//	public void deleteById(String id) {
//		customerRepository.deleteById(id);
//	}
}
