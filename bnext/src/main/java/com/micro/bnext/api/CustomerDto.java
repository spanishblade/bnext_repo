package com.micro.bnext.api;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.micro.bnext.api.constraint.ValidPhoneNumberCustomConstraint;

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
	
	@ValidPhoneNumberCustomConstraint
	private String phoneNumber;
}
