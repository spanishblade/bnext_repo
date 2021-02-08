package com.micro.bnext.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.micro.bnext.model.CustomerEntity;
import com.micro.bnext.repository.CustomerRepository;
import com.micro.bnext.service.MyService;

@Component
public class MyServiceImpl implements MyService{

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public List<CustomerEntity> findAll() {
		return customerRepository.findAll();
	}

	@Override
	public CustomerEntity findById(String id) {
		return customerRepository.findById(id);
	}

	@Override
	public String create(CustomerEntity entity) {
		return customerRepository.create(entity);
	}

	@Override
	public void update(CustomerEntity entity) {
		customerRepository.update(entity);
	}
	
	@Override
	public void deleteById(String id) {
		customerRepository.deleteById(id);
	}
}
