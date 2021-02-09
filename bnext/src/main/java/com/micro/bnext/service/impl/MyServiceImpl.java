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
	
//	@Override
//	public List<Customer> findAll() {
//		return customerRepository.findAll();
//	}

	@Override
	public Customer findById(String id) {
		Optional<Customer> customer = customerRepository.findById(Integer.valueOf(id));
		if (customer.isPresent()) {
			return customer.get();
		}
		return new Customer(0, "falso", "falso");
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
