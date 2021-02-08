package com.micro.bnext.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class TelephoneDto {

	private String id;
	
	private String number;
}
