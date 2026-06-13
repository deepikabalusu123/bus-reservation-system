package com.bus.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {
@NotBlank private String username;
@NotBlank private String password;
public String getUsername() {
	// TODO Auto-generated method stub
	return null;
}
public Object getPassword() {
	// TODO Auto-generated method stub
	return null;
}
}