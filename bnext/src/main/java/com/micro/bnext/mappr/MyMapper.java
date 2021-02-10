package com.micro.bnext.mappr;

import org.springframework.stereotype.Component;
import com.micro.bnext.api.CustomerDto;
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
        return CustomerDto.builder()
        		.id(String.valueOf((customer.getId())))
        		.name(customer.getName())
        		.surname(customer.getSurname())
        		.phoneNumber(customer.getPhoneNumber())
        		.build();
    }
    
	/**
	 * Method mapper CustomerDto To Customer.
	 */
    public Customer CustomerDtoToCustomerEntity(CustomerDto customerDto) {
        return Customer.builder()
        		.name(customerDto.getName())
        		.surname(customerDto.getSurname())
        		.phoneNumber(customerDto.getPhoneNumber())
        		.build();
    }
}
