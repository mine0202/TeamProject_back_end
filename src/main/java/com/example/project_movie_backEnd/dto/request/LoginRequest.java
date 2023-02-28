package com.example.project_movie_backEnd.dto.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
@Getter
@Setter
@ToString
public class LoginRequest {
	@NotBlank
  private String username;

	@NotBlank
	private String password;
}








