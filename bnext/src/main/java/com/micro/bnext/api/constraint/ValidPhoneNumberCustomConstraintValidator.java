package com.micro.bnext.api.constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

public class ValidPhoneNumberCustomConstraintValidator implements ConstraintValidator<ValidPhoneNumberCustomConstraint, String> {

	@Value("${userID}")
	protected String userID;
	
	@Value("${userID}")
	protected String masterKey;
	
    @Override
    public void initialize(ValidPhoneNumberCustomConstraint phoneNumber) {
    }

    @Override
    public boolean isValid(String phoneNumber, ConstraintValidatorContext cxt) {
        boolean isValid =  phoneNumber != null && phoneNumber.matches("[0-9]+")
          && (phoneNumber.length() > 8) && (phoneNumber.length() < 14);
        
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://neutrinoapi.net/phone-validate?number=+34"+phoneNumber+"&user-id="+ userID +"&api-key=" + masterKey;
        String response  = restTemplate.postForObject(url, null, String.class);
        return isValid;
    }
    
}
