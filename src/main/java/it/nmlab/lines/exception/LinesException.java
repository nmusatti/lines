package it.nmlab.lines.exception;

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
