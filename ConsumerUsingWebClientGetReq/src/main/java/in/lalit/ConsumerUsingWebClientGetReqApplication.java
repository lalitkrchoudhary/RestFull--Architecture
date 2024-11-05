package in.lalit;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.lalit.response.CurrencyResponse;
import in.lalit.service.CurrencyService;

@SpringBootApplication
public class ConsumerUsingWebClientGetReqApplication {

	public static void main(String[] args) {
		 ApplicationContext context= SpringApplication.run(ConsumerUsingWebClientGetReqApplication.class, args);
		
		CurrencyService bean= context.getBean("service",CurrencyService.class);
		
		bean.invokeRestApiSync("USD", "IN");
		
		System.out.println("++++++++++++++++++++++++++++++++++");
		bean.invokeRestApiASync("USD", "Ind");
		
	}

}
