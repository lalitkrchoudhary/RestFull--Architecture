//package in.lalit.runner;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.web.reactive.function.client.WebClient;
//
//public class CurrencyServiceRunner implements CommandLineRunner {
//
//	private static final String REST_END_POINT = "http://localhost:8080/ProducerUsingWebClient/api/currency/getCurrencyExchangeCost/from/USD/to/INR";
//
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		//Sending Synchronous request
//		WebClient webClient= WebClient.create();
//		System.out.println("*****Synchronous call started**********");
//		webClient.get().uri(REST_END_POINT,args[0],args[1]).retrieve().bodyToMono();
//
//	}
//
//}
