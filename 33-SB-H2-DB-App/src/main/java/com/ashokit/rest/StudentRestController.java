package com.ashokit.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.entity.Student;
import com.ashokit.repository.StudentRepository;

@RestController
public class StudentRestController {

	@Autowired
	private StudentRepository studentRepo;

	@GetMapping(value = "/student/{studentId}")
	public Student getStudentById(@PathVariable Integer studentId) {
		Optional<Student> findById = studentRepo.findById(studentId);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@GetMapping(value = "/students")
	public List<Student> getStudents() {
		return studentRepo.findAll();
	}
}
