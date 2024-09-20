package in.lalit.restController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/employee")
public class Employee {

	@GetMapping("/read")
	public ResponseEntity<String>  getEmployee(@RequestParam(defaultValue = "10",required = false) Integer id, @RequestParam String name){
		
		return new ResponseEntity<String>("id is:: "+id+" and name is :: "+name, HttpStatus.OK);
	}
}
