package in.lalit.service;

import java.util.List;

import in.lalit.model.Tourist;

public interface ITouristMangService {

	public String registerToursit(Tourist tourist);
	public List<Tourist> fetchAllTourist();
	public Tourist fetchById(Integer id);
	public String updateTouristByDetails(Tourist tourist);
}
