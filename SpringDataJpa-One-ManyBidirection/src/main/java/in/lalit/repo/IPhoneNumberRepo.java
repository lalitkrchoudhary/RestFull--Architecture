package in.lalit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.lalit.model.PhoneNumber;

public interface IPhoneNumberRepo extends JpaRepository<PhoneNumber, Integer> {

}
