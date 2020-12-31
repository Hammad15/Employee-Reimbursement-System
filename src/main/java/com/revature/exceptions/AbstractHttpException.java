package com.revature.exceptions;

@SuppressWarnings("serial")
public abstract class AbstractHttpException extends RuntimeException {
	private int statusCode;
	
	protected AbstractHttpException(String message, int statusCode) {
		super(message);
		this.statusCode = statusCode;
	}

	public int getStatusCode() {
		return statusCode;
	}
	
	
}
