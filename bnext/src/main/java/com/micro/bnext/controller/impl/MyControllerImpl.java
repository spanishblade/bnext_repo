package com.micro.bnext.controller.impl;

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
import com.micro.bnext.service.MyService;

@RestController
public class MyControllerImpl implements MyController{
	
//    @Autowired
//    MyService myService;
//    
	@Override
	public String HelloWorld1() {
		return new String("Hello World 1!");
	}
	
	@Override
	public ResponseEntity<ResponseBase<String>> HelloWorld2() {
        return new ResponseEntity<>(new ResponseBase<>(new String("Hello World 2!")), HttpStatus.OK);
	}
    
//	@Override
//	public ResponseEntity<ResponseBase<List<Object>>> findAll() {
//		// return myService.findAll();
//		return null;
//	}
//	
//	@Override
//    public ResponseEntity<ResponseBase<Object>> findById(@PathVariable("id") String id) {
//        //return myService.findById(id);
//		return null;
//    }
//
//	@Override
//	public ResponseEntity<ResponseBase<Object>> create(@RequestBody CustomerDto dto) {
//		// return myService.create(resource);
//		return null;
//	}
//    
//	@Override
//	public void update(String id, CustomerDto dto) {
//		//myService.getById(resource.getId());
//		//myService.update(resource);
//    }
//
//	@Override
//	public void delete(String id) {
//		myService.deleteById(id);
//	}
}
