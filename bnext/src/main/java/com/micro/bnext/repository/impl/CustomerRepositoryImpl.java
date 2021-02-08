package com.micro.bnext.repository.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.micro.bnext.model.CustomerEntity;
import com.micro.bnext.model.TelephoneEntity;
import com.micro.bnext.repository.CustomerRepository;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

	public List<CustomerEntity> findAll() {
		List<TelephoneEntity> telephoneEntityList =  new ArrayList<TelephoneEntity>();
		telephoneEntityList.add(TelephoneEntity.builder().id("1").number("667012407").build());
		telephoneEntityList.add(TelephoneEntity.builder().id("2").number("667012408").build());
		telephoneEntityList.add(TelephoneEntity.builder().id("3").number("667012409").build());
		return new ArrayList<CustomerEntity>(Arrays.asList(CustomerEntity.builder().id("1").name("Angel").surname("Laguna").listTelephonesEntities(telephoneEntityList).build()));
	}

	public CustomerEntity findById(String id) {
		List<TelephoneEntity> telephoneEntityList =  new ArrayList<TelephoneEntity>();
		telephoneEntityList.add(TelephoneEntity.builder().id("1").number("667012409").build());
		return CustomerEntity.builder().id("1").name("Angel").surname("Laguna").listTelephonesEntities(telephoneEntityList).build();
	}

	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	public String create(CustomerEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(CustomerEntity entity) {
		// TODO Auto-generated method stub
		
	}
}
