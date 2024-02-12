package it.nmlab.lines;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import it.nmlab.lines.exception.LinesException;

@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ErrorResolver extends ResponseEntityExceptionHandler {

	public ErrorResolver() {
	}

    @ExceptionHandler({LinesException.class})
    public ResponseEntity<Error> handleLineException(LinesException ex) {
    	return new ResponseEntity<Error>(new Error(ex.getMessage()), HttpStatus.BAD_REQUEST);
    }

}
