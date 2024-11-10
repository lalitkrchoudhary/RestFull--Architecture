package in.lalit.service;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import jakarta.mail.internet.MimeMessage;



public class PurchaseOrderImpl implements IPurchaseOrder {
	
	@Autowired
	private JavaMailSender sender;
	
	@Value("${spring.mail.username}")
	private String fromEmail;

	@Override
	public String purchase(String[] items, double[] prices, String[] toEmail) throws Exception {
		
		double amt =0.0;
		for(double price:prices) {
			amt = amt+price;
		}
		
	 String msg=	Arrays.toString(items) +" with price :: "+ Arrays.toString(prices)+ " are purchase with billamount :: "+amt;
		

	  String status= sendMail(msg,toEmail);
	 
		return  msg + "========>"+ status;
	}

	private String sendMail(String msg, String[] toEmail) throws Exception {

		System.out.println("Sender Implementation class :: "+sender.getClass().getName());
		
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message,true);
		
		helper.setFrom(fromEmail);
		helper.setCc(toEmail);
		helper.setSubject("Open it know it");
		helper.setSentDate(new Date());
		helper.setText(msg);
		helper.addAttachment("amazon.jpg", new ClassPathResource("amazon.jpg"));
		sender.send(message);
		
		return "mail-sent";
	}

}
