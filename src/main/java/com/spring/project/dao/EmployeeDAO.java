package com.spring.project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.border.EtchedBorder;

import org.springframework.stereotype.Component;

import com.spring.project.dto.Employee;

@Component
public class EmployeeDAO {
	
	EntityManagerFactory emEntityManagerFactory=Persistence.createEntityManagerFactory("sandy");
	EntityManager entityManager=emEntityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	public void saveEmployee(Employee employee) {
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}
	public List<Employee> getAllEmployees() {
		Query query=entityManager.createQuery("select e from Employee e");
		List<Employee> employees=query.getResultList();
		return employees;
	}
	public Employee getEmployeesById(int id) {
	     return entityManager.find(Employee.class, id);
	}
	public void updateEmployees(Employee employees) {
           entityTransaction.begin();
           entityManager.merge(employees);
           entityTransaction.commit();
		
	}
	public void deleteEmployee(int id) {
	         entityTransaction.begin();
	         entityManager.remove(getEmployeesById(id));
	         entityTransaction.commit();
	}
	

}
