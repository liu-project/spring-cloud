package com.example.feign.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {

	private static final long serialVersionUID = 7157196564513300531L;
	
	private Integer Id;
	private String name;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
