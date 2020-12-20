package com.acme.architecture.testing.example.exception;

public class ExampleException extends Exception {

	private static final long serialVersionUID = 7321371172678736473L;

	public ExampleException(String message) {
		super(message);
	}

	public ExampleException(Throwable cause) {
		super(cause);
	}

	public ExampleException(String message, Throwable cause) {
		super(message, cause);
	}

}
