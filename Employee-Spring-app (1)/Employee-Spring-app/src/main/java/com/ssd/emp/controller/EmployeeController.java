package com.ssd.emp.controller;

import com.ssd.emp.dto.EmployeeDto;
import com.ssd.emp.service.EmployeeService;
import com.ssd.emp.service.EmployeeValidateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees/api")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private EmployeeValidateService service;
	
	@PostMapping("/Addemployees")
	public ResponseEntity<?>saveEmployee(@Validated  @RequestBody EmployeeDto dto,BindingResult bindingResult){
		
		System.out.println(dto);
		
		if (service.validateData(bindingResult) != null) {
			return service.validateData(bindingResult);

		} else {
			return new ResponseEntity<EmployeeDto>(employeeService.saveEmployee(dto), HttpStatus.CREATED);
		}

	}
	@GetMapping("/employees/{id}")
	public ResponseEntity<?>getEmployeeTaxDeductionCurrentYear(@PathVariable("id")Long id){
		
		
		return new ResponseEntity<Double>(employeeService.getEmployeeTaxDeductionCurrentYear(id),HttpStatus.OK);
		
	}
	

}
