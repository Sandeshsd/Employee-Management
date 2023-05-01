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
 private String employeeName;
 private long empoyeePhoneNumber;
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public long getEmpoyeePhoneNumber() {
	return empoyeePhoneNumber;
}
public void setEmpoyeePhoneNumber(long empoyeePhoneNumber) {
	this.empoyeePhoneNumber = empoyeePhoneNumber;
}
 
 
}
