package com.micro.bnext.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
@AllArgsConstructor
@Builder
public class Customer {

	private String name;
	
	private List<Telephone> listTelephones;
}
