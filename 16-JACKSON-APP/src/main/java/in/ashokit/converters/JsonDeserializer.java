package in.ashokit.converters;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.domain.Student;

public class JsonDeserializer {

	public static void main(String[] args) throws Exception {

		// Converting JSON data to java object
		ObjectMapper mapper = new ObjectMapper();
		
		/*Student obj = mapper.readValue(new File("student.json"), Student.class);
		 * System.out.println(obj);
		 */

		List<Student> students = mapper.readValue(new File("student.json"), 
								new TypeReference<List<Student>>() {});
		
		students.forEach(student -> {
			System.out.println(student);
		});

	}
}
