package in.lalit.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

@Table(name = "PHONE")
public class PhoneNumber {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long regNo;
	
	@Nonnull
	private Long phoneNo;
	
	@Nonnull
	private String provider;
	
	@Nonnull
	private String type;
	
	@ManyToOne(targetEntity = Person.class, cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "PERSON_ID",referencedColumnName ="pid")
	//@EqualsAndHashCode.Exclude
	private Person person ;

	@Override
	public String toString() {
		return "PhoneNumber [regNo=" + regNo + ", phoneNo=" + phoneNo + ", provider=" + provider + ", type=" + type
				+ "]";
	}
	
	

}
