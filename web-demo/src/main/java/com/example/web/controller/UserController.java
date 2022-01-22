package com.example.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.web.dto.UserDTO;

@RestController
public class UserController {

	@GetMapping("/{id}")
	UserDTO findUserById(@PathVariable("id")Integer id) {
		UserDTO userDTO = new UserDTO();
		userDTO.setId(id);
		userDTO.setName("fake name");
		return userDTO;
	}
}
