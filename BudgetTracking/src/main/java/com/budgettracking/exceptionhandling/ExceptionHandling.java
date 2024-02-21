package com.budgettracking.exceptionhandling;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
public class ExceptionHandling {

	/**
	 * This method handles the NoSuchElementException and returns a specific message
	 * in a ResponseEntity.
	 *
	 * @param ex The NoSuchElementException to be handled
	 * @return A ResponseEntity with a specific message
	 */
	@ResponseStatus(HttpStatus.NOT_FOUND) // Set the response status to 404
	@ExceptionHandler(NoSuchElementException.class) // Handle the NoSuchElementException exception
	public ResponseEntity<Object> handleNoSuchElementException(NoSuchElementException ex) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Resource ID not found"); // Return a ResponseEntity
																							// with 404 status and a
																							// specific message
	}

// Set the response status to HttpStatus.BAD_REQUEST
	@ResponseStatus(HttpStatus.BAD_REQUEST)
// Handle MethodArgumentTypeMismatchException when it occurs
	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ResponseEntity<String> handleMethodArgumentTypeMismatch(MethodArgumentTypeMismatchException ex) {
		// Create an error message indicating the invalid argument type
		String errorMessage = "Invalid argument type: " + ex.getName();
		// Return a ResponseEntity with the error message and HttpStatus.BAD_REQUEST
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
	}

}
