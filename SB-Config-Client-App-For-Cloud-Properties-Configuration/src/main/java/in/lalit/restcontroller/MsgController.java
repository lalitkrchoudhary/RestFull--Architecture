package in.lalit.restcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class MsgController {
	
	@Value("${msg : Config Server not working, plz check....}") // use to get the single value form the properties file
	public String msg;
	

	@GetMapping("/")
	public ResponseEntity<String> showMsg(){
		
		return  new ResponseEntity<String>(msg,HttpStatus.OK);
	}
}
