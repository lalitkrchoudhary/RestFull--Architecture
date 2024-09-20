package in.lalit.restController;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wish")
public class WishContoller {

	@GetMapping("/msg")
	public ResponseEntity<String> generateWishMessage(){
		
		String body=null;
	 LocalDateTime ldt =	LocalDateTime.now();
	int time= ldt.getHour();
	if(time<12)
		body="Good morning";
	else if(time<16)
		body="Good afternoon";
	else if(time<20)
		body ="Good evening";
	else 
		body = "Good night";
		
	ResponseEntity<String> entity=	new ResponseEntity<>(body, HttpStatus.OK);
		return entity;
		
	}

}
