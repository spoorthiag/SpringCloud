package com.spoorthi.user.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.spoorthi.user.VO.Department;
import com.spoorthi.user.VO.ResponseTemplateVO;
import com.spoorthi.user.entity.User;
import com.spoorthi.user.repository.UserRepository;

@Service
public class UserService {
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		// TODO Auto-generated method stub
		logger.info("Inside saveUserof UserService");
		return userRepository.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		// TODO Auto-generated method stub
		logger.info("Inside getUserWithDepartment of UserService");
		ResponseTemplateVO vo=new ResponseTemplateVO();
		User user=userRepository.findByUserId(userId);
				
		Department department = 
				restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" +user.getDepartmentId(), 
				Department.class);
		vo.setUser(user);
        vo.setDepartment(department);
        return  vo;
		
	}

}
