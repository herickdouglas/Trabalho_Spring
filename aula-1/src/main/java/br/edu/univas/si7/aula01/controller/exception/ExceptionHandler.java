package br.edu.univas.si7.aula01.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@ControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> handleObjectNotFound(
						ObjectNotFoundException excecaoCapturada, HttpServletRequest req) {
		
		StandardError error = new StandardError(
				excecaoCapturada.getMessage(),
				HttpStatus.NOT_FOUND.value(), 
				new Date());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
	
	@org.springframework.web.bind.annotation.ExceptionHandler(InvalidDataException.class)
	public ResponseEntity<StandardError> handleInvalidData(
			InvalidDataException excecaoCapturada, HttpServletRequest req) {
		
		StandardError error = new StandardError(
				excecaoCapturada.getMessage(),
				HttpStatus.BAD_REQUEST.value(), 
				new Date());
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
	}
}
