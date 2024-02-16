package it.nmlab.lines.exception;

/*
 * A single exception class for all handled errors, given that they are simply propagated to the
 * user.
 */
public class LinesException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public LinesException() {
	}

	public LinesException(String message) {
		super(message);
	}

	public LinesException(Throwable cause) {
		super(cause);
	}

	public LinesException(String message, Throwable cause) {
		super(message, cause);
	}

}
