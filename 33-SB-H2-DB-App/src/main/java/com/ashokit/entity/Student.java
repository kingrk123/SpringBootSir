package com.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "STUDENT_MASTER")
@Data
public class Student {

	@Id
	private Integer studentId;
	private String studentName;
	private Integer studentAge;
}
