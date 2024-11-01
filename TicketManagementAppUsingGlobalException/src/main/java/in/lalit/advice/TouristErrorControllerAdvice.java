package in.lalit.advice;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.lalit.error.ErrorDetails;
import in.lalit.exception.TouristNotFoundException;

@RestControllerAdvice
public class TouristErrorControllerAdvice {
	
	@ExceptionHandler(TouristNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleTouristNotFound(TouristNotFoundException tf){
		System.out.println("TouristErrorControllerAdvice.handleTouristNotFound()");
		ErrorDetails details =new ErrorDetails(LocalDateTime.now(),tf.getMessage(),"404-Not Found");
		
		return  new ResponseEntity<ErrorDetails>(details,HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(Exception.class) // All problem on solution to manage all exception if noting handled by manually
	public ResponseEntity<ErrorDetails> handleAllProblems(Exception e){
		System.out.println("TouristErrorControllerAdvice.handleAllProblems()");
		
		ErrorDetails details= new ErrorDetails(LocalDateTime.now(),e.getMessage(),"Something went wrong at server side");
		
		return new ResponseEntity<ErrorDetails>(details,HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
