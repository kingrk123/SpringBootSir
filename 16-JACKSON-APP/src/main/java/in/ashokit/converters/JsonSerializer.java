package in.ashokit.converters;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.domain.Address;
import in.ashokit.domain.Student;

public class JsonSerializer {

	public static void main(String[] args) throws Exception {
		/*
		 * Student s1 = new Student(); s1.setStudentId(101); s1.setStudentName("Ashok");
		 * s1.setStudentAge(25);
		 * 
		 * // jackson api logic (converting java obj to json data) ObjectMapper mapper =
		 * new ObjectMapper(); String jsonString = mapper.writeValueAsString(s1);
		 * System.out.println(jsonString);
		 */

		Student s1 = new Student();
		s1.setStudentId(101);
		s1.setStudentName("Ashok");
		s1.setStudentAge(25);
		s1.setAddress(new Address("Hyd", "TG", "India"));

		Student s2 = new Student();
		s2.setStudentId(201);
		s2.setStudentName("John");
		s2.setStudentAge(34);
		s2.setAddress(new Address("Vegas", "New York", "USA"));

		List<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);

		// jackson api logic (converting java obj to json data)
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = mapper.writeValueAsString(students);
		System.out.println(jsonString);
	}
}
