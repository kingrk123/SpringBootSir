package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.domain.Student;
import com.ashokit.service.StudentService;

@Controller
public class StudentController {

	private StudentService service;

	public StudentController(StudentService service) {
		this.service = service;
	}

	@ModelAttribute
	public void loadFormData(Model model) {
		System.out.println("******* loadFormData() method called *******");
		model.addAttribute("genders", service.getGenders());
		model.addAttribute("timings", service.getTimings());
		model.addAttribute("courses", service.getCourses());
	}

	@GetMapping("/studentReg")
	public String loadRegForm(Model model) {
		model.addAttribute("student", new Student());
		return "regForm";
	}

	@PostMapping("/studentReg")
	public String handleRegBtn(Student student, Model model) {
		System.out.println(student);
		if (student != null) {
			model.addAttribute("msg", "Student Registered Successfully");
		}
		return "regForm";
	}
}
