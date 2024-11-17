package in.lalit.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.lalit.model.Person;
import in.lalit.model.PhoneNumber;
import in.lalit.service.IPersonManagementService;

@Component
public class AssociateRunner implements CommandLineRunner {

	@Autowired
	private IPersonManagementService service;
	
	@Override
	public void run(String... args) throws Exception {
		
//		//Create a parent object
//		Person person = new Person("Kholi", "kalitakuci");
//		
//		//Create a chile object
//		PhoneNumber p1 = new PhoneNumber(99889988L, "Vodafone", "Office");
//		PhoneNumber p2 = new PhoneNumber(77772222L, "Idea", "Home");
//
//	//		//link parent to child
//		p1.setPerson(person);
//		p2.setPerson(person);
//		
//		Set<PhoneNumber> contact= Set.of(p1,p2);
//		
//		//link child to parent
//		person.setContactDetails(contact);
//		
//		String status= service.savePerson(person);
//		System.out.println(status);


		//loading opertion from Parent to Child [1 to Many]
		service.fetchByPerson().forEach(person->{
			System.out.println("Parent: "+person);
		});
		System.out.println();
		
		//loading opertaion from Child to Parent [Many to 1]
		service.fetchByPhone().forEach(phone->{
			System.out.println("chile : "+phone);
			Person person = phone.getPerson();
			System.out.println(person);
		});
		
		
		//deleting
		String deleteByPerson = service.deleteByPerson(3);
		System.out.println(deleteByPerson);
	}

}
