package com.micro.bnext.api;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class CustomerDto {

	private String id;
	
	private String name;
	
	private String surname;
	
	private List<TelephoneDto> listTelephonesDto;
}
