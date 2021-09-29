package com.ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import com.ashokit.entity.Student;
import com.ashokit.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		StudentRepository studentRepository = context.getBean(StudentRepository.class);
		
		/*Student s = new Student();
		s.setStudentId(105);
		s.setStudentName("Kumar");
		s.setStudentEmail("kumar@ashokit.in");
		s.setStudentAge(28);

		studentRepository.save(s);*/
		

		/*Optional<Student> findById = studentRepository.findById(103);
		if (findById.isPresent()) {
			System.out.println(findById.get());
		}else {
			System.out.println("Record Not Available...");
		}*/
		
		/*Iterable<Student> findAll = studentRepository.findAll();
		findAll.forEach(s -> {
			System.out.println(s);
		});*/
		
		/*Iterable<Student> findAllById = studentRepository.findAllById(Arrays.asList(102,103,104));
		findAllById.forEach(s -> {
			System.out.println(s);
		});*/
		
		//studentRepository.deleteById(125);
		
		//Student student = studentRepository.findByStudentName("Ashok");
		
		//Student student  = studentRepository.findByStudentEmail("ram@ashokit.in");
		
		//Student student = studentRepository.findByStudentNameAndStudentEmail("Sita", "sita.b@ashokit.in");

		//List<Student> students = studentRepository.findByStudentAgeGreaterThanEqual(22);
		
		//List<Student> students = studentRepository.findByStudentAgeIn(Arrays.asList(22,24));
		
		
		//List<Student> students = studentRepository.findAll(Sort.by("studentAge").ascending());
		
		Student s = new Student();
		s.setStudentAge(22);
		
		Example<Student> example = Example.of(s);
		
		List<Student> students = studentRepository.findAll(example, Sort.by("studentName"));
		
		students.forEach(student -> {
			System.out.println(student);
		});
		
		context.close();

	}

}
