package in.lalit.restController;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WishContoller {

	@GetMapping
	public String generateWishMessage(){
		
		String msg ="Welcome to Restful Service from Spring";
		return msg;
	
		
	}

}
