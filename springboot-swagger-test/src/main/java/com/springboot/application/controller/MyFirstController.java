package com.springboot.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

//To consider my class as rest controller no xml needed
@RestController
@Api(value = "product")
@RequestMapping("/product")
public class MyFirstController {
	
	@ApiOperation(value = "product1", nickname = "info", notes = "gets information", httpMethod = "GET",
            consumes = "application/json", produces = "application/json")
   /* @ApiResponses(value = {@ApiResponse(code = 4003, message = "Invalid customer id"),
            @ApiResponse(code = 4007, message = "Invalid format, or unknown SSN supplied in the request"),
            @ApiResponse(code = 1013, message = "Missing required parameter customerId / ssn")})*/
	@RequestMapping("/product1")
	 public String welcome() {
	 return "Welcome to Spring Boot";
	 }
	 
	@ApiOperation(value = "hello", nickname = "info", notes = "gets information", httpMethod = "GET",
            consumes = "application/json", produces = "application/json")
	 @RequestMapping("/hello")
	 public String myData() {
	 return "Hello Spring Boot";
	 }

}
