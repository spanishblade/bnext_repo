package com.micro.bnext.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.micro.bnext.api.CustomerDto;
import com.micro.bnext.model.CustomerEntity;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


public interface MyController {
	
    /**
     * Get HelloWorld!
     *
     * @return String
     */
    @GetMapping("/hello1")
	public String HelloWorld1();

    @GetMapping("/hello2")
    public ResponseEntity<ResponseBase<String>> HelloWorld2();
    
    /**
     * Get list of objects.
     *
     * @return ResponseEntity<ResponseBase<List<Object>>>
     */
    @ApiOperation(value = "Get list of objects")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = ControllerConstants.API_RESPONSE_200),
        @ApiResponse(code = 500, message = ControllerConstants.API_RESPONSE_500)
    })
    @GetMapping(value = "/customers", produces = {
            MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ResponseBase<List<CustomerDto>>> findAll();
    
    
    /**
     * Get object by id.
     *
     * @return ResponseEntity<ResponseBase<Object>>
     */
    @ApiOperation(value = "Get object by id")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = ControllerConstants.API_RESPONSE_200),
        @ApiResponse(code = 500, message = ControllerConstants.API_RESPONSE_500)
    })
    @GetMapping(value = "/customers/{id}", produces = {
            MediaType.APPLICATION_JSON_VALUE})
	  public ResponseEntity<ResponseBase<CustomerDto>> findById(@PathVariable("id") String id);

    
    /**
     * Create object.
     *
     * @return ResponseEntity<ResponseBase<Object>>
     */
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = ControllerConstants.API_RESPONSE_201),
            @ApiResponse(code = 500, message = ControllerConstants.API_RESPONSE_500)
        })
	@PostMapping(value = "/customers", produces = {
            MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<ResponseBase<CustomerDto>> create(@RequestBody CustomerDto dto);

    
    /**
     * Update object by id.
     *
     * @return ResponseEntity<ResponseBase<Object>>
     */
    @ApiOperation(value = "Update object by id")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = ControllerConstants.API_RESPONSE_200),
        @ApiResponse(code = 500, message = ControllerConstants.API_RESPONSE_500)
    })
    @PutMapping(value = "/customers/{id}", produces = {
            MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void update(@PathVariable( "id" ) String id, @RequestBody CustomerDto dto);

    
    /**
     * Delete object by id.
     *
     * @return ResponseEntity<ResponseBase<Object>>
     */
    @ApiOperation(value = "Delete object by id")
    @ApiResponses(value = {
        @ApiResponse(code = 204, message = ControllerConstants.API_RESPONSE_204),
        @ApiResponse(code = 500, message = ControllerConstants.API_RESPONSE_500)
    })
    @DeleteMapping(value = "/customers/{id}", produces = {
    MediaType.APPLICATION_JSON_VALUE})
    public void delete(@PathVariable("id") String id);
}
