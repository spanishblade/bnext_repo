package com.micro.bnext.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.micro.bnext.api.CustomerDto;
import com.micro.bnext.api.TelephoneDto;
import com.micro.bnext.model.CustomerEntity;
import com.micro.bnext.model.TelephoneEntity;
import com.micro.bnext.service.MyService;

@Component
public class MyServiceImpl implements MyService{

	@Override
	public List<CustomerEntity> findAll() {
		List<TelephoneEntity> telephoneEntityList =  new ArrayList<TelephoneEntity>();
		telephoneEntityList.add(TelephoneEntity.builder().id("1").number("667012407").build());
		telephoneEntityList.add(TelephoneEntity.builder().id("2").number("667012408").build());
		telephoneEntityList.add(TelephoneEntity.builder().id("3").number("667012409").build());
		return new ArrayList<CustomerEntity>(Arrays.asList(CustomerEntity.builder().id("1").name("Angel").surname("Laguna").listTelephonesEntities(telephoneEntityList).build()));
	}

	@Override
	public CustomerEntity findById(String id) {
		List<TelephoneEntity> telephoneEntityList =  new ArrayList<TelephoneEntity>();
		telephoneEntityList.add(TelephoneEntity.builder().id("1").number("667012409").build());
		return CustomerEntity.builder().id("1").name("Angel").surname("Laguna").listTelephonesEntities(telephoneEntityList).build();
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long create(Object resource) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Object resource) {
		// TODO Auto-generated method stub
		
	}
}
