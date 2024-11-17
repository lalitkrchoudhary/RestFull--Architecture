package in.lalit.service;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.lalit.model.Person;
import in.lalit.model.PhoneNumber;
import in.lalit.repo.IPersonRepo;
import in.lalit.repo.IPhoneNumberRepo;

@Service
public class PersonMangServiceImpl implements IPersonManagementService {

	@Autowired
	private IPersonRepo personRepo;
	
	@Autowired
	private IPhoneNumberRepo phoneRepo;
	
	@Override
	public String savePerson(Person person) {
		 Integer idValue=personRepo.save(person).getPid();
		return "The person is save with id:: "+idValue;
	}

	@Override
	public String savePhoneNumbers(Iterable<PhoneNumber> numbers) {

		for(PhoneNumber phoneNumber: numbers) {
			phoneRepo.save(phoneNumber);
		}
		return ((Set<PhoneNumber>) numbers).size()+"no of phone number are saved";
	}

	@Override
	public Iterable<Person> fetchByPerson() {
		// TODO Auto-generated method stub
		return personRepo.findAll();
	}

	@Override
	public Iterable<PhoneNumber> fetchByPhone() {
		// TODO Auto-generated method stub
		return phoneRepo.findAll();
	}

	@Override
	public String deleteByPerson(int personId) {
		Optional<Person> optional = personRepo.findById(personId);
		if(optional.isPresent()) {
			personRepo.delete(optional.get());
			return "Person get deleted";
		}
		return "Person not found";
	}

	

}
