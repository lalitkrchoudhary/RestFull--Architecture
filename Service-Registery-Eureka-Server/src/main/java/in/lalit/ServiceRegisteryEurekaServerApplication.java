package in.lalit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegisteryEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegisteryEurekaServerApplication.class, args);
	}

}
