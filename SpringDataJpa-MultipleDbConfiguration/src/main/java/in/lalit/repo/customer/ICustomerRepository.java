package in.lalit.repo.customer;

import org.springframework.data.jpa.repository.JpaRepository;

import in.lalit.config.model.customer.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

}
