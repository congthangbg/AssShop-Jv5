package com.vn.model;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {
	@NotEmpty
	@Length(min = 3)
	private String username;
	@NotEmpty
	@Length(min = 3)
	private String password;
	
	private Boolean isEdit =false;
}
