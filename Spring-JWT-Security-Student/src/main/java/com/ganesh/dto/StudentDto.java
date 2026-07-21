package com.ganesh.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class StudentDto {
	
	
	
	private Integer id;
	
    @NotNull(message = "Name Is Require")
	private String name;
	
    @NotNull(message = "Address Is Require")
	private String address;
	
    @NotNull(message = "Age Is Require")
	private Integer age;
	
    @NotNull(message = "Email Is Require")
    @Column(unique = true)
	private String email;
	
    @NotNull(message = "Mobile No Is Require")
    @Column(unique = true)
	private String mobileNo;

}
