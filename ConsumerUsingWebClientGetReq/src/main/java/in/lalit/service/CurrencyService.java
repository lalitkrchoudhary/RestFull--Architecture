package in.lalit.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.lalit.response.CurrencyResponse;

@Service("service")
public class CurrencyService {

	private static final String REST_END_POINT = "http://localhost:8080/ProducerUsingWebClient/api/currency/getCurrencyExchangeCost/from/USD/to/INR";

	
	public void invokeRestApiSync(String from, String to) {
		
		//Sending Synchronous request
		WebClient webClient= WebClient.create();
		System.out.println("*****Synchronous call started**********");
		 CurrencyResponse response= webClient.get().uri(REST_END_POINT,from,to).retrieve().bodyToMono(CurrencyResponse.class).block();

		 System.out.println(response);
		 System.out.println("************Synchronous call ended***************");
	}
	
public void invokeRestApiASync(String from, String to) {
		
		//Sending Synchronous request
		WebClient webClient= WebClient.create();
		System.out.println("*****ASynchronous call started**********");
		 webClient.get()
		 .uri(REST_END_POINT,from,to).retrieve().bodyToMono(CurrencyResponse.class)
		 .subscribe(CurrencyService::myResponse);

		 System.out.println("************ASynchronous call ended***************");
	}
public static void myResponse(CurrencyResponse response) {
	System.out.println("hello world");
	System.out.println(response);
}
}
