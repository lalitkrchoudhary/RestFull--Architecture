package in.lalit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.lalit.dao.ITouristRepo;
import in.lalit.exception.TouristNotFoundException;
import in.lalit.model.Tourist;
@Service
public class TouristManagServiceImpl implements ITouristMangService {

	@Autowired
	private ITouristRepo repo;
	
	@Override
	public String registerToursit(Tourist tourist) {
		
		Integer tid= repo.save(tourist).getTid();
		
		return "Tourist is register having the ticket id :: "+tid;
	}

	@Override
	public List<Tourist> fetchAllTourist() {
		List<Tourist> touristData= repo.findAll();
		touristData.sort((t1,t2)-> t1.getName().compareTo(t2.getName()));
		return touristData;
	}

	@Override
	public Tourist fetchById(Integer id) {
		Optional<Tourist> optional= repo.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		else {
			
		throw new TouristNotFoundException(id + " record not found");
		}
	}

}
