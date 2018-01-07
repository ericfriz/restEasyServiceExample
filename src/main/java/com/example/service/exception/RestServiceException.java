package com.example.service.exception;

public class RestServiceException  extends RuntimeException {

	private static final long serialVersionUID = 8786490199447702970L;

	public RestServiceException(String message) {
		super(message);
	}

	public RestServiceException(String message, Exception ex) {
		super(message, ex);
	}
}
