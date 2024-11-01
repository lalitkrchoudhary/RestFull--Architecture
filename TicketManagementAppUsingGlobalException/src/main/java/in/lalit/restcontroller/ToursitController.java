package in.lalit.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import in.lalit.model.Tourist;
import in.lalit.service.ITouristMangService;

@RestController
@RequestMapping("/api/tourist")
public class ToursitController {
	
	@Autowired
	private ITouristMangService service;
	
	@PostMapping("/register")
	public ResponseEntity<String> enrollTourist(@RequestBody Tourist tourist){
		
			
		String resultMsg =service.registerToursit(tourist);
		return new ResponseEntity<String>(resultMsg, HttpStatus.OK);
			
		
		
	}
	
	
	@GetMapping("/findAll")
	public ResponseEntity<?> findAll(){
		
			
		List<Tourist> list  =service.fetchAllTourist();
		return new ResponseEntity<List<Tourist>>(list, HttpStatus.OK);
			
		
		
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<?> findById(@PathVariable Integer id){
		
		
			Tourist tourist= service.fetchById(id);
			return new ResponseEntity<Tourist>(tourist, HttpStatus.OK);
				
			
			
	}
	
	
	@PutMapping("/modify")
	public ResponseEntity<String> updateTourist(@RequestBody Tourist tourist){
		System.out.println(tourist);
		
		String msg=	service.updateTouristByDetails(tourist);
		return  new ResponseEntity<String>(msg, HttpStatus.OK);
		
	}

}
