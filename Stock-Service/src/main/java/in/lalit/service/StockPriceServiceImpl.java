package in.lalit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.lalit.entity.StockPrice;
import in.lalit.exception.StockNotFoundException;
import in.lalit.repository.StockRepository;

@Service
public class StockPriceServiceImpl implements IStockPriceService {

	@Autowired
	private StockRepository repo;
	
	
	@Override
	public Double findByCompanyName(String companyName) {
		 StockPrice stockPrice = repo.findByCompanyName(companyName);
		 if(stockPrice==null) {
			 throw new StockNotFoundException("Error Company is not available");
		 }
		 
		return stockPrice.getCompanyPrice();
	}

}
