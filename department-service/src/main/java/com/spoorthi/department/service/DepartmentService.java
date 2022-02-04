package com.spoorthi.department.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spoorthi.department.entity.Department;
import com.spoorthi.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	private static final Logger logger = LoggerFactory.getLogger(DepartmentService.class);

	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		logger.info("Inside save department method of department service");
		return departmentRepository.save(department);
	}

	
	  public Department findByDepartmentId(Long departmentId) { 
	  logger.info("Inside findDepartmentbyId  method of department service");
	  return departmentRepository.findByDepartmentId(departmentId); }
	 

}
