package in.lalit.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.lalit.request.PassengerInfo;
import in.lalit.response.Ticket;

@RestController
@RequestMapping("/api/ticket")
public class TicketBookingRestController {

	@PostMapping("/register")
	public ResponseEntity<Ticket> bookTicket(@RequestBody PassengerInfo passenger) {
		Ticket ticket = new Ticket();
		ticket.setTicketId("10");
		ticket.setFrom(passenger.getFrom());
		ticket.setTo(passenger.getTo());
		ticket.setJourneyDate(passenger.getJourneyDate());
		ticket.setPassengerName(passenger.getFirstName() + " " + passenger.getLastName());
		ticket.setTicketPrice(345.5);
		ticket.setTicketStatus("booked");
		ticket.setTrainNumber(passenger.getTrainNumber());
		
		return new ResponseEntity<Ticket>(ticket,HttpStatus.OK);
		
		
	}
}
