package in.lalit.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.lalit.model.Customer;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	@GetMapping("/report/{theId}")
	public ResponseEntity<Customer> getCustomer(@PathVariable("theId") Integer id){
		
		Customer customer = new Customer();
		customer.setId(id);
		customer.setFirstName("Dhoni");
		customer.setLastName("Singh");
		customer.setAge(49);
		customer.setColor(new String[] {"red","blue","green","pink","white"});
		customer.setStudies(List.of("10th", "12th","Graduation","Master","PhD"));
		customer.setPhone(Set.of(12345324L,8940923L,8209L,23809L));
		customer.setIdDetails(Map.of("Adhar",1234345,"pancard","SDF234"));
		
		
		ResponseEntity<Customer> entity = new ResponseEntity<Customer>(customer, HttpStatus.OK);
		
		return entity;
	}
}
