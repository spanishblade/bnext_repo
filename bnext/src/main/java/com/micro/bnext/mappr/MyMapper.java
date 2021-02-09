package com.micro.bnext.mappr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.micro.bnext.api.CustomerDto;
import com.micro.bnext.api.TelephoneDto;
import com.micro.bnext.model.Customer;

/**
 * Controller mapper. Map rest to entity to dto and turn back.
 */
@Component
public class MyMapper {

	/**
	 * Method mapper CustomerEntity To CustomerDto.
	 */
    public CustomerDto CustomerEntityToCustomerDto(Customer customer) {
    	List<TelephoneDto> listTelephoneDto = new ArrayList<TelephoneDto>();
    	//listTelephoneDto.add(TelephoneEntityToTelephoneDto(customerEntity.getListTelephonesEntities().get(0)));
        return CustomerDto.builder().id(String.valueOf(customer.getId())).name(customer.getName()).surname(customer.getSurname()).listTelephonesDto(listTelephoneDto).build();
    }
    
	/**
	 * Method mapper ListTelephoneEntity To ListTelephoneDto.
	 */
//    public List<CustomerDto> ListCustomerEntityToListCustomerDto(List<Customer> listCustomerEntity) {
//    	List<TelephoneDto> listTelephoneDto = new ArrayList<TelephoneDto>();
//    	listTelephoneDto.add(TelephoneEntityToTelephoneDto(listCustomerEntity.get(0).getListTelephonesEntities().get(0)));
//    	listTelephoneDto.add(TelephoneEntityToTelephoneDto(listCustomerEntity.get(0).getListTelephonesEntities().get(1)));
//    	listTelephoneDto.add(TelephoneEntityToTelephoneDto(listCustomerEntity.get(0).getListTelephonesEntities().get(2)));
//        return new ArrayList<CustomerDto> (Arrays.asList(CustomerDto.builder()
//        		.id(listCustomerEntity.get(0).getId())
//        		.name(listCustomerEntity.get(0).getName())
//        		.surname(listCustomerEntity.get(0).getSurname())
//        		.listTelephonesDto(listTelephoneDto).build()));
//    }
    
//    public CustomerDto CustomerDtoToCustomerEntity(CustomerDto customerDto) {
//    	List<TelephoneDto> listTelephoneDto = new ArrayList<TelephoneDto>();
//    	listTelephoneDto.add(TelephoneEntityToTelephoneDto(customerEntity.getListTelephonesEntities().get(0)));
//        return CustomerDto.builder().id(customerEntity.getId()).name(customerEntity.getName()).surname(customerEntity.getSurname()).listTelephonesDto(listTelephoneDto).build();
//    }
    
	/**
	 * Method mapper TelephoneEntity To TelephoneDto.
	 */
//    public TelephoneDto TelephoneEntityToTelephoneDto(TelephoneEntity telephoneEntity) {
//        return TelephoneDto.builder().id(telephoneEntity.getId()).number(telephoneEntity.getNumber()).build();
//    }
}
