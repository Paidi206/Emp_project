package com.ssd.emp.dto;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;



public class EmployeeDto {
	
	private Long empId;
	 @NotBlank(message = "first name is required")
	private String firstName;
	@NotBlank(message = "last name is required")
	private String lastName;
	
	@Email(message = "Email is required")
	private String email;
	@NotBlank(message = "Phone no is required")
	private String phoneNo;
	
	@DateTimeFormat
	private String doj;
	@NotNull(message = "must be enterd")
	private Double sal;
	public EmployeeDto(Long empId, @NotBlank(message = "first name is required") String firstName,
			@NotBlank(message = "last name is required") String lastName,
			@NotBlank(message = "Email is required") String email,
			@NotBlank(message = "Phone no is required") String phoneNo,
			@NotBlank(message = "Date of joining is required") String doj, @NotNull(message = "ygyg") Double sal) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.doj = doj;
		this.sal = sal;
	}
	public EmployeeDto() {
		super();
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "EmployeeDto [emp_id=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phoneNo=" + phoneNo + ", doj=" + doj + ", sal=" + sal + "]";
	}
	
}
