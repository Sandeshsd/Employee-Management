package com.spring.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.project.dao.EmployeeDAO;
import com.spring.project.dto.Employee;

@Controller
public class EmployeeController {

	@Autowired
	Employee employee;
	@Autowired
	EmployeeDAO dao;
	
	@RequestMapping("/saveEmployee")
	public ModelAndView addEmployee() {
		ModelAndView view=new ModelAndView();
		view.addObject("employee", employee);
		view.setViewName("saveemployee.jsp");
		return view;
	}
	@RequestMapping("/addEmployee")
	public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
		ModelAndView view=new  ModelAndView();
		dao.saveEmployee(employee);
		view.setViewName("addemployee.jsp");
		return view;
		
	}
}
