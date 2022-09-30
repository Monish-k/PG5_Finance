package com.lti.root.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class ExceptionFound extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionFound(String msg) {
	super(msg);
}
}