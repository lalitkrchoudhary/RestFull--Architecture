package in.lalit.dto1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true) // It is used because if data is added and we don't know then it will ignore
public class Customer2 {
	private Integer id;
	private String firstName;
	private String lastName;
	private boolean active;
	
	private Address address;
	
	private String[] language;
	
	

}
