package in.lalit.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.lalit.model.Student;
import in.lalit.service.IStudentService;

@RestController
@RequestMapping("/api/student")
public class StudentRestController {
	
	@Autowired
	private IStudentService service;

	@PostMapping("/register")
	public ResponseEntity<String> saveStudent(@RequestBody Student student){
		
		String body= service.saveStudent(student);
		return new ResponseEntity<String>(body,HttpStatus.CREATED);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<?> displayStudents(){
	
		List<Student> students= service.findAll();
		return  new ResponseEntity<List<Student>>(students,HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<?> displayStudentsById(@PathVariable("id") Integer id){
		
		Student student= service.findById(id);
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
}
