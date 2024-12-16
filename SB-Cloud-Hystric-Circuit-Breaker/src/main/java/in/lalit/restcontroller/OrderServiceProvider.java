package in.lalit.restcontroller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/api/order")
public class OrderServiceProvider {

	@GetMapping("/show")
	@HystrixCommand(fallbackMethod = "showFallBack")
	public String showMsg() {
		System.out.println("OrderServiceProvider.showMsg()");
		
		if(new Random().nextInt(10)<=10) {
			throw new RuntimeException("Dummy");
		}
		return  "Hello from provider";
	}
	
	public String showFallBack() {
		System.out.println("OrderServiceProvider.showFallBack()");
		return "From FallbackMethod";
	}
}
