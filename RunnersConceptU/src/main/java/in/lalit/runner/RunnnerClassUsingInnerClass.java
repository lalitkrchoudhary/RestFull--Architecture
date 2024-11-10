package in.lalit.runner;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RunnnerClassUsingInnerClass {
	
	//Using Command Line Runner using Anonymous inner class
//	@Bean
//	public CommandLineRunner app() {
//		return new CommandLineRunner() {
//			
//			@Override
//			public void run(String... args) throws Exception {
//				System.out.println("Args are :: "+ Arrays.asList(args));
//			}
//		};
//	}
	
	
	//Using lambda expression
	@Bean
	public CommandLineRunner app() {
		CommandLineRunner obj = (args)->{
			System.out.println("Args for lambda:: "+Arrays.asList(args));
		};
		return obj;
	}


}
