package in.lalit.model;

import java.util.Set;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//import lombok.EqualsAndHashCode;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor

@Table(name = "PERSON")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;
	
	@Nonnull
	private String pname;
	
	@Nonnull
	private String paddress;
	
	
	@OneToMany(targetEntity = PhoneNumber.class, cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "PERSON_ID",referencedColumnName ="pid")
	//@EqualsAndHashCode.Exclude
	private Set<PhoneNumber> contactDetails;


	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", paddress=" + paddress + ", contactDetails="
				+  "]";
	}
	
	

}
