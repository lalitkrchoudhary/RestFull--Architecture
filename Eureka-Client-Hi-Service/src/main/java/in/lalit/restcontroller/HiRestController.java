package in.lalit.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.lalit.client.HelloClient;

@RestController

public class HiRestController {
	
	@Autowired
	private HelloClient client;
	
	@GetMapping("/hi/{name}")
	public String sayHi(@PathVariable String name) {
		System.out.println("Implementation classname is :: " + client.getClass().getName());
	
		String hieeMsg="Hello ";
		
		String invokeHelloService = client.invokeHelloService("shiv bhagwan");
		
		
		return hieeMsg +name+ " how are you? I am "+ invokeHelloService+" the god";
	}

}
