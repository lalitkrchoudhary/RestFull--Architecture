package in.lalit.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.lalit.config.model.customer.Customer;
import in.lalit.config.model.product.Product;
import in.lalit.repo.customer.ICustomerRepository;
import in.lalit.repo.product.IProductRepository;

@RestController
@RequestMapping("/api")
public class MultipleDataRestController {

	@Autowired
	private ICustomerRepository customerRepo;
	
	@Autowired
	private IProductRepository productRepo;
	
	
	@GetMapping("/products")
	public List<Product> findAllProducts(){
		return productRepo.findAll();
	}
	
	@GetMapping("/customers")
	public List<Customer> findAllCustomers(){
		return customerRepo.findAll();
	}
	
	
}
