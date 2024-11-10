package in.lalit;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.lalit.service.ERailClientApp;




@SpringBootApplication
public class ConsumerUsingWebClientGetReqApplication {

	public static void main(String[] args) {
		 ApplicationContext context= SpringApplication.run(ConsumerUsingWebClientGetReqApplication.class, args);
		
		ERailClientApp bean= context.getBean(ERailClientApp.class);
		bean.invokeRestApi();
	}

}
