package com.micro.bnext.controller.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.micro.bnext.api.CustomerDto;
import com.micro.bnext.controller.MyController;
import com.micro.bnext.controller.ResponseBase;
import com.micro.bnext.mappr.MyMapper;
import com.micro.bnext.model.CustomerEntity;
import com.micro.bnext.service.MyService;

@RestController
public class MyControllerImpl implements MyController{
	
    @Autowired
    MyService myService;
    
    @Autowired
    MyMapper mapper;
    
	@Override
	public String HelloWorld1() {
		return new String("Hello World 1!");
	}
	
	@Override
	public ResponseEntity<ResponseBase<String>> HelloWorld2() {
        return new ResponseEntity<>(new ResponseBase<>(new String("Hello World 2!")), HttpStatus.OK);
	}
    
	@Override
	public ResponseEntity<ResponseBase<List<CustomerDto>>> findAll() {
		List<CustomerEntity> listCustomerEntity = myService.findAll();
		return new ResponseEntity<>(new ResponseBase<>(mapper.ListCustomerEntityToListCustomerDto(listCustomerEntity)), HttpStatus.OK);
	}
	
	@Override
    public ResponseEntity<ResponseBase<CustomerDto>> findById(@PathVariable("id") String id) {
		CustomerEntity customerEntity =  myService.findById(id);
		return new ResponseEntity<>(new ResponseBase<>(mapper.CustomerEntityToCustomerDto(customerEntity)), HttpStatus.OK);
    }

	@Override
	public ResponseEntity<ResponseBase<CustomerDto>> create(@RequestBody CustomerDto dto) {
		// return myService.create(resource);
		return null;
	}
    
	@Override
	public void update(String id, CustomerDto dto) {
		//myService.getById(resource.getId());
		//myService.update(resource);
    }

	@Override
	public void delete(String id) {
		myService.deleteById(id);
	}
}
