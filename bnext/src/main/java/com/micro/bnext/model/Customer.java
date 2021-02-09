package com.micro.bnext.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
@AllArgsConstructor
@Builder
@Entity
@Table(name="CUSTOMER")
public class Customer{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "SURNAME")
	private String surname;
	
	//private List<TelephoneEntity> listTelephonesEntities;
	
	public Customer() {
    }
}
