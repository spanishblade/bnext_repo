package com.micro.bnext.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.micro.bnext.model.Customer;
import com.micro.bnext.repository.CustomerRepository;
import com.micro.bnext.service.MyService;

@Service
public class MyServiceImpl implements MyService{

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public List<Customer> findAll() {
		return (List<Customer>) customerRepository.findAll();
	}

	@Override
	public Optional<Customer> findById(String id) {
		return customerRepository.findById(Integer.valueOf(id));
	}

	@Override
	public Customer create(Customer entity) {
		return customerRepository.save(entity);
	}

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
