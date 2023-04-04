package com.ssd.emp.service;

import com.ssd.emp.dto.EmployeeDto;

public interface EmployeeServiceI {
	
	public EmployeeDto saveEmployee(EmployeeDto dto);
	
	public Double getEmployeeTaxDeductionCurrentYear(Long id);

}
