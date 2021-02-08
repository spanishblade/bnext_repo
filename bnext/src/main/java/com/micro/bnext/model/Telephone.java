package com.micro.bnext.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
@AllArgsConstructor
@Builder
public class Telephone {

	private String prefix;
	
	private String number;
	
}
