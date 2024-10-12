package in.lalit;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.lalit.dto.Customer;
import in.lalit.dto1.Customer2;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       System.out.println("hello");
        
        try {
			//Creating a Object Mapper
        	
        	ObjectMapper mapper= new ObjectMapper();
        	
			/*
			 * //using the Object read the data from the json file and convert it into
			 * object Customer customer= mapper.readValue(new
			 * File("file/data.json"),Customer.class); System.out.println(customer);
			 * System.out.println(customer.getFirstName()); customer.setFirstName("lalit");
			 * System.out.println(customer.getFirstName()); System.out.println(customer);
			 */
        	
        	
        
        	Customer2 customer= mapper.readValue(new File("file/data2.json"), Customer2.class);
        	System.out.println("data");
        	System.out.println("All data :: "+customer);
        	System.out.println("Only the id :: "+customer.getId());
        	System.out.println("All the address only :: "+customer.getAddress());
        	System.out.println("ALL THE ARRAY DATA");
        	for (String language : customer.getLanguage()) {
				System.out.println(language);
			}
        	
        	
        	
		} catch (Exception e) {
			// TODO: handle exception
		  System.out.println( e.getStackTrace());
		}
        
    }
}
