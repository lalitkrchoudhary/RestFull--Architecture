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


import in.lalit.model.Tourist;
import in.lalit.service.ITouristMangService;

@RestController
@RequestMapping("/api/tourist")
public class ToursitController {
	
	@Autowired
	private ITouristMangService service;
	
	@PostMapping("/register")
	public ResponseEntity<String> enrollTourist(@RequestBody Tourist tourist){
		try {
			
		String resultMsg =service.registerToursit(tourist);
		return new ResponseEntity<String>(resultMsg, HttpStatus.OK);
			
		} catch (Exception e) {

			return new ResponseEntity<String>("Problem in tourist enrollement",HttpStatus.INTERNAL_SERVER_ERROR); //Error 500
		}
		
	}
	
	
	@GetMapping("/findAll")
	public ResponseEntity<?> findAll(){
		try {
			
		List<Tourist> list  =service.fetchAllTourist();
		return new ResponseEntity<List<Tourist>>(list, HttpStatus.OK);
			
		} catch (Exception e) {

			return new ResponseEntity<String>("Problem in tourist fetching",HttpStatus.INTERNAL_SERVER_ERROR); //Error 500
		}
		
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<?> findById(@PathVariable Integer id){
		
		try {
			Tourist tourist= service.fetchById(id);
			return new ResponseEntity<Tourist>(tourist, HttpStatus.OK);
				
			} catch (Exception e) {

				return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR); //Error 500
			}
			
	}

}
