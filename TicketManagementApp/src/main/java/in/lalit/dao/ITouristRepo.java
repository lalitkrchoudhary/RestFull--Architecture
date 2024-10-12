package in.lalit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.lalit.model.Tourist;

public interface ITouristRepo extends JpaRepository<Tourist, Integer> {

}
