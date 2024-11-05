package in.lalit.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwagerDocsConfig {
	
	@Bean
	public Docket SwaggerApi() {
	       return new Docket(DocumentationType.SWAGGER_2) //UI SCREEN type
	               .select() // to specify RestController
	               .apis(RequestHandlerSelectors.basePackage("in.lalit.restcontroller")) // base package for RestController
	               .paths(PathSelectors.regex("api/tourist.*")) //To specify the request paths
	               .build() //build the docket object
	               .useDefaultResponseMessages(true)
	               .apiInfo(getApiInfo());
	   }

	private ApiInfo getApiInfo() {
		Contact contact = new Contact("lalit","http://www.lalit.ai.website","lalit124@gmail.com");
		return new ApiInfo("ToursitInfo", "Give the infomation about tourist activities", "3.4.RELEASE", "http:", contact,"Nand ENglish", "http://apache.org/liceience/guru",Collections.emptyList());
	}

}
