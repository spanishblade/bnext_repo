package com.micro.bnext.api;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class TelephoneDto implements Serializable{

	private static final long serialVersionUID = -3101576117834152481L;

	private String id;
	
	private String number;
}
