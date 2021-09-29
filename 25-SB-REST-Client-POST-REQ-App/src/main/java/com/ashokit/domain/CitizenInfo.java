package com.ashokit.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CitizenInfo {
	private String firstName;
	private String lastName;
	private String gender;
	private String dob;
	private String stateName;
}