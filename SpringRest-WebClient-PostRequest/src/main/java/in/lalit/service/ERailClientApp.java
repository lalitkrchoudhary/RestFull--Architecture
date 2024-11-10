
package in.lalit.service;

import java.net.URI;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import in.lalit.request.PassengerInfo;
import in.lalit.response.Ticket;

@Service("service")
public class ERailClientApp {
	

	public void invokeRestApi() {
		WebClient client= WebClient.create();
		String REST_END_URL = "http://localhost:8080/SpringRest-TicketBooking-ProviderApp/api/ticket/register";
		
		PassengerInfo body = new PassengerInfo();
		body.setFirstName("amar");
		body.setLastName("kumar");
		body.setFrom("Guwahati");
		body.setTo("Banaglure");
		body.setJourneyDate("12/12/2023");
		body.setTrainNumber("123421L");
		
		Ticket response= client.post().uri(REST_END_URL).accept(MediaType.APPLICATION_JSON).body(BodyInserters.fromValue(body))
		.retrieve().bodyToMono(Ticket.class).block();
		
		System.out.println(response);
		
	}

}
