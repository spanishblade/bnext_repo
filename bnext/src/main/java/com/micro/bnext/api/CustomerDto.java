package com.micro.bnext.api;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto implements Serializable{

	private static final long serialVersionUID = -9199467996060628963L;

	private String id;
	
	private String name;
	
	private String surname;
	
	//private List<TelephoneDto> listTelephonesDto;
}
