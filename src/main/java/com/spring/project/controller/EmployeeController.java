package com.spring.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	@RequestMapping("/viewEmployee")
	public ModelAndView viewemployees() {
	List<Employee> employees=	dao.getAllEmployees();
	ModelAndView view=new ModelAndView("viewemployees.jsp");
	view.addObject("employees",employees);
	return view;
	}
	@RequestMapping("/updateEmployees")
	public ModelAndView updateEmployees(@RequestParam int id) {
		ModelAndView view=new ModelAndView("updateemployee.jsp");
		Employee employee=dao.getEmployeesById(id);
		view.addObject("employee",employee);
		return view;
	}
	@RequestMapping("/saveUpdateEmployee")
	public ModelAndView saveUpdatedEmployee(@ModelAttribute Employee employee) {
		ModelAndView modelAndView=new ModelAndView("viewemployees.jsp");
		 dao.updateEmployees(employee);
	    modelAndView.addObject(("employees"), dao.getAllEmployees());
	    return modelAndView;
	}
	@RequestMapping("/deleteEmployee")
	public ModelAndView deleteEmployee(int id) {
     ModelAndView  view=new ModelAndView("viewemployees.jsp");
     dao.deleteEmployee(id);
     view.addObject("employees",dao.getAllEmployees());
     return view;
	}
}
