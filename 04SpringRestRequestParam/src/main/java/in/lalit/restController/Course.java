package in.lalit.restController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class Course {
	
	//PathVariable is used to get input direct from uri not in key value pair
	@GetMapping("/info/{id}")
	public ResponseEntity<String> getCourseById(@PathVariable Integer id){
		
		String body = null;
		if(id==2) 
			body="The id is present "+id;
		else if(id==3)
			body="The id is present "+id;
		else 
			body="ID NOT FOUND ";
		
		ResponseEntity<String> entity = new ResponseEntity<String>(body,HttpStatus.OK); 
		return entity;
	}

}
