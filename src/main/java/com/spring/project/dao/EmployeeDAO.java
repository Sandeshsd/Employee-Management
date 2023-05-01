package com.spring.project.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
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
	

}
