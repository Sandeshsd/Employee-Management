package com.spring.project.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int employeeId;
 private int employeeName;
 private int empoyeePhoneNumber;
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public int getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(int employeeName) {
	this.employeeName = employeeName;
}
public int getEmpoyeePhoneNumber() {
	return empoyeePhoneNumber;
}
public void setEmpoyeePhoneNumber(int empoyeePhoneNumber) {
	this.empoyeePhoneNumber = empoyeePhoneNumber;
}
 
 
}
