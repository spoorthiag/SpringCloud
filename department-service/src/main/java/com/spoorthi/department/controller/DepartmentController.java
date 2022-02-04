package com.spoorthi.department.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spoorthi.department.entity.Department;
import com.spoorthi.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	private static final Logger logger = LoggerFactory.getLogger(DepartmentController.class);
	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		logger.info("Inside SaveDepartment method of Department Controller");
		// return departmentService.saveDepartment(department);
		return departmentService.saveDepartment(department);

	}
	
	  @GetMapping("/{id}") 
	  public Department findByDepartmentId(@PathVariable("id")Long departmentId) {
	  logger.info("Inside findDepartmentbyId method of Department Controller");
	  return departmentService.findByDepartmentId(departmentId);
	  
	  }
	 

}
