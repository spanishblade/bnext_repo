package com.micro.bnext.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
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
	public Customer create(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public void update(String id, Customer customer) {
		Optional<Customer> customerDB = customerRepository.findById(Integer.valueOf(id));
		if (customerDB.isPresent()) {
			customerDB.get().setName(customer.getName());
			customerDB.get().setSurname(customer.getSurname());
			customerDB.get().setPhoneNumber(customer.getPhoneNumber());
			customerRepository.save(customerDB.get());
		}
	}
	
	@Override
	public void delete(String id) {
		Optional<Customer> customerDB = customerRepository.findById(Integer.valueOf(id));
		if (customerDB.isPresent()) {
			customerRepository.delete(customerDB.get());
		}
	}
}
