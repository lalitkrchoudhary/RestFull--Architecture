package in.lalit;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.lalit.config.model.customer.Customer;
import in.lalit.config.model.product.Product;
import in.lalit.repo.customer.ICustomerRepository;
import in.lalit.repo.product.IProductRepository;

@SpringBootApplication
public class SpringDataJpaMultipleDbConfigurationApplication implements CommandLineRunner{
	
	
	@Autowired
	private IProductRepository productRepo;
	
	@Autowired
	private ICustomerRepository customerRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaMultipleDbConfigurationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		productRepo.saveAll(Arrays.asList(
				new Product(10, "p-11", "Electronic"),
				new Product(11, "p-22", "Woods"),
				new Product(12, "p-33", "Plastic"),
				new Product(13, "p-44", "Fossil")
				));
		
		
		customerRepo.saveAll(Arrays.asList(
				new Customer(01,"sachin","sachin@gamil.com"),
				new Customer(02,"kholi","kholi@gamil.com"),
				new Customer(03,"dhoni","dhoni@gamil.com"),
				new Customer(04,"rahul","rahul@gamil.com")
				));
	}

}
