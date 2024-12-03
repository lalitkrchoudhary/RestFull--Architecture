package in.lalit.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloRestController {
	
	@GetMapping("/hello/{name}")
	public String sayHi(@PathVariable String name) {
	
		String hieeMsg="Hello MY NAME IS ";
		return hieeMsg +name+ " how are you?";
	}

}
