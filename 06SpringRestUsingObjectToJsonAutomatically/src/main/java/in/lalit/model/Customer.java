package in.lalit.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Data;

@Data
public class Customer {

	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
	private String[] color;
	private List<String> studies;
	private Set<Long> phone;
	private Map<String, Object> idDetails;
}

