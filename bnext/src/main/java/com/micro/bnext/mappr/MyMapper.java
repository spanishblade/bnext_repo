package com.micro.bnext.mappr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.micro.bnext.api.CustomerDto;
import com.micro.bnext.api.TelephoneDto;
import com.micro.bnext.model.Customer;

/**
 * Controller mapper. Map rest to Customer to Dto and turn back.
 */
@Component
public class MyMapper {

	/**
	 * Method mapper Customer To CustomerDto.
	 */
    public CustomerDto CustomerEntityToCustomerDto(Customer customer) {
    	List<TelephoneDto> listTelephoneDto = new ArrayList<TelephoneDto>();
    	//listTelephoneDto.add(TelephoneEntityToTelephoneDto(customerEntity.getListTelephonesEntities().get(0)));
        return CustomerDto.builder().id(String.valueOf((customer.getId()))).name(customer.getName()).surname(customer.getSurname()).phoneNumber(customer.getPhoneNumber()).build();
    }
    
	/**
	 * Method mapper CustomerDto To Customer.
	 */
    public Customer CustomerDtoToCustomerEntity(CustomerDto customerDto) {
    	List<TelephoneDto> listTelephoneDto = new ArrayList<TelephoneDto>();
    	//listTelephoneDto.add(TelephoneEntityToTelephoneDto(customerDto.getListTelephonesEntities().get(0)));
        return Customer.builder().name(customerDto.getName()).surname(customerDto.getSurname()).phoneNumber(customerDto.getPhoneNumber()).build();
    }
    
	/**
	 * Method mapper TelephoneEntity To TelephoneDto.
	 */
//    public TelephoneDto TelephoneEntityToTelephoneDto(TelephoneEntity telephoneEntity) {
//        return TelephoneDto.builder().id(telephoneEntity.getId()).number(telephoneEntity.getNumber()).build();
//    }
}
