package dev.fourthcafe.exception210910_0510.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class CommonResponseEntity {
	private final String message;
	private final int status;
	private final String error;


	public CommonResponseEntity(final String message, final HttpStatus error) {
		this.message = message;
		this.status = error.value();
		this.error = error.getReasonPhrase();
	}
}