package in.lalit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.lalit.service.IPurchaseOrder;

@SpringBootApplication
public class SpringBootMailAppApplication {

	public static void main(String[] args) {
		
		ApplicationContext context= SpringApplication.run(SpringBootMailAppApplication.class, args);
		
		IPurchaseOrder order= context.getBean(IPurchaseOrder.class);
		
		try {
			String msg= order.purchase(new String[] {"Car","Bike","Truck"}, new double[] {123.5,143.6,234.10}, new String[] {"lalit8694123@gmail.com","choudharyamar085@gmail.com","lalit8694@gmail.com"});
		
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();		}
	}

}
