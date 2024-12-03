package in.lalit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.lalit.entity.StockPrice;
import java.util.List;


public interface StockRepository extends JpaRepository<StockPrice, Integer> {

	public StockPrice  findByCompanyName(String companyName);
}
