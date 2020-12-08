package com.acme.architecture.testing.example.exception;

public class ExampleValidException extends Exception {

	private static final long serialVersionUID = 7321371172678736473L;

	public ExampleValidException(String message) {
		super(message);
	}

	public ExampleValidException(Throwable cause) {
		super(cause);
	}

	public ExampleValidException(String message, Throwable cause) {
		super(message, cause);
	}

}
