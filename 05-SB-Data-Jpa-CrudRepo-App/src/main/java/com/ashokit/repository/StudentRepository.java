package com.ashokit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ashokit.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

	// select * from students_dtls where STUDENT_NAME = :name
	public Student findByStudentName(String name);

	// select * from students_Dtls where student_email=:email
	public Student findByStudentEmail(String email);

	// select * from students_dtls where student_name=:name and student_email =
	// :email
	public Student findByStudentNameAndStudentEmail(String name, String email);

	// select * from students_dtls where student_age >= 20
	public List<Student> findByStudentAgeGreaterThanEqual(Integer age);

	// select * from students_dtls where student_age in (:age1,:age2)
	public List<Student> findByStudentAgeIn(List<Integer> ages);

}