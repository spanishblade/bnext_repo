package com.micro.bnext.repository.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.micro.bnext.model.Customer;
import com.micro.bnext.repository.CustomerRepository;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

//	public List<Customer> findAll() {
//		List<TelephoneEntity> telephoneEntityList =  new ArrayList<TelephoneEntity>();
//		telephoneEntityList.add(TelephoneEntity.builder().id("1").number("667012407").build());
//		telephoneEntityList.add(TelephoneEntity.builder().id("2").number("667012408").build());
//		telephoneEntityList.add(TelephoneEntity.builder().id("3").number("667012409").build());
//		return new ArrayList<Customer>(Arrays.asList(Customer.builder().id("1").name("Angel").surname("Laguna").listTelephonesEntities(telephoneEntityList).build()));
//	}

	public Customer findById(String id) {
//		List<TelephoneEntity> telephoneEntityList =  new ArrayList<TelephoneEntity>();
//		telephoneEntityList.add(TelephoneEntity.builder().id("1").number("667012409").build());
//		return Customer.builder().id("1").name("Angel").surname("Laguna").listTelephonesEntities(telephoneEntityList).build();
		
		Optional<Customer> optionalCostumer = findById(Long.parseLong(id));
		return optionalCostumer.get();
	}

	@Override
	public <S extends Customer> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Customer> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Customer> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Customer> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Customer entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Customer> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	

	

//	public void deleteById(String id) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public String create(Customer entity) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public void update(Customer entity) {
//		// TODO Auto-generated method stub
//		
//	}
}
