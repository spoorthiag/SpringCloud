package com.spoorthi.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spoorthi.user.VO.ResponseTemplateVO;
import com.spoorthi.user.entity.User;
import com.spoorthi.user.service.UserService;

@RestController
	@RequestMapping("/users")
		public class UserController {

	    @Autowired
	    private UserService userService;
	    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	    @PostMapping("/")
	    public User saveUser(@RequestBody User user) {
	        logger.info("Inside saveUser of UserController");
	        return userService.saveUser(user);
	    }

	    @GetMapping("/{id}")
	    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
	        logger.info("Inside getUserWithDepartment of UserController");
	        return userService.getUserWithDepartment(userId);
	    }


}
