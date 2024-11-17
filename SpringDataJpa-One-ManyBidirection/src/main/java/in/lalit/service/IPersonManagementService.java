package in.lalit.service;

import in.lalit.model.Person;
import in.lalit.model.PhoneNumber;

public interface IPersonManagementService {

	public String savePerson(Person person);
	public String savePhoneNumbers(Iterable<PhoneNumber> numbers);
	public Iterable<Person> fetchByPerson();
	public Iterable<PhoneNumber> fetchByPhone();
	public String deleteByPerson(int personId);
}
