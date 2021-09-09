package dev.fourthcafe.exception210910_0510.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class ProjectExceptionHandler {

	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ResponseEntity<?> httpMessageNotReadableExceptionhandler(HttpMessageNotReadableException ex) {
		final HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
		final CommonResponseEntity entity = new CommonResponseEntity(ex.getMessage(), status);

		return new ResponseEntity<>(entity, status);
	}
}