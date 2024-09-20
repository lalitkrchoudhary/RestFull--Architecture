package in.lalit.restController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerOperationController {

	@GetMapping("/report")
	public ResponseEntity<String> getPost(){
		System.out.println("CustomerOperationController.getPost()");
		return new ResponseEntity<String>("Get Method is calling" , HttpStatus.OK);
	}
	
	@PostMapping("/register")
	public ResponseEntity<String> createPost(){
		return new ResponseEntity<String>("Post Method is calling" , HttpStatus.OK);
	}
	
	@PatchMapping("/update")
	public ResponseEntity<String> getUpdate(){
		return new ResponseEntity<String>("Update Method is calling" , HttpStatus.OK);
	}
}
