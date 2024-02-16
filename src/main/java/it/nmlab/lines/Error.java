package it.nmlab.lines;

/**
 * A simple error message response
 */
public class Error {

	private String message;
	
	public Error(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
