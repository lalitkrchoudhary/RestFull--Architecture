package in.lalit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.lalit.model.Person;

public interface IPersonRepo extends JpaRepository<Person,Integer> {

}
