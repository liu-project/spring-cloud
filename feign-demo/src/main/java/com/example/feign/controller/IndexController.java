package com.example.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.feign.dto.UserDTO;
import com.example.feign.service.UserFeignClient;

@RestController
public class IndexController {

	@Autowired
	UserFeignClient userFeignClient;
	
	@GetMapping("/{id}")
	public UserDTO index(@PathVariable("id")Integer id) {
		return userFeignClient.findUserById(id);
	}
}
