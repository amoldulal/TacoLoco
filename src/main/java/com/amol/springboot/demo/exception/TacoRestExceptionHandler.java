package com.amol.springboot.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class TacoRestExceptionHandler {

	//Add an exception handler for TacoNotFoundException
	@ExceptionHandler 
	/*TacoErrorResponse:Type of response body 
	TacoNotFoundException:Exception type to handle / catch */
	public ResponseEntity<TacoErrorResponse> handleException(TacoNotFoundException exc){
		//create TacoErrorResponse
		TacoErrorResponse error=new TacoErrorResponse(HttpStatus.NOT_FOUND.value(),exc.getMessage(),System.currentTimeMillis());
		//return ResponseEntity
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	//Add another exception handler... to catch any exception (catch all)
		@ExceptionHandler
		public ResponseEntity<TacoErrorResponse> handleException(Exception exc){
			TacoErrorResponse error=new TacoErrorResponse(HttpStatus.BAD_REQUEST.value(),exc.getMessage(),System.currentTimeMillis());
			return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
		}


}
