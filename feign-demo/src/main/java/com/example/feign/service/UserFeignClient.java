package com.example.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.feign.dto.UserDTO;

@FeignClient("WEB-DEMO")
public interface UserFeignClient {
	
	@GetMapping("/{id}")
	UserDTO findUserById(@PathVariable("id")Integer id);

}
