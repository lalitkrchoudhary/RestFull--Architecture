package in.lalit.repo.product;

import org.springframework.data.jpa.repository.JpaRepository;

import in.lalit.config.model.product.Product;

public interface IProductRepository extends JpaRepository<Product, Integer> {

}
