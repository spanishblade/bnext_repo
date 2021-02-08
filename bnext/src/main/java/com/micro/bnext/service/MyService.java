package com.micro.bnext.service;

import java.util.List;

public interface MyService {

	public List<Object> findAll();

	public Object findById(String id);

	public void deleteById(String id);

	public Long create(Object resource);
	
	public void update(Object resource);
}
